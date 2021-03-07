package activityTracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public void insertActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?,?,?)")) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect", sqlException);
        }
    }

    public Activity selectById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?")) {
            stmt.setLong(1, id);
            List<Activity> result = selectByPreparedStatement(stmt);
            if (result.size() == 1) {
                return result.get(0);
            }
            throw new IllegalArgumentException("not found!");

        } catch (SQLException sqlException) {
            throw new IllegalStateException("cannot connect!", sqlException);
        }

    }

    private List<Activity> selectByPreparedStatement(PreparedStatement stmt) {
        List<Activity> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Activity activity = new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf((rs.getString("activity_type"))));
                result.add(activity);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("wrong statement", sqlException);
        }

    }

    public List<Activity> selectAllActivities() {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities")) {
            return selectByPreparedStatement(stmt);

        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("Connection failed", sqlException);
        }
    }

    public List<Activity> selectActivitiesByType(ActivityType type) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where activity_type = ?")) {
            stmt.setString(1, type.toString());
            return selectByPreparedStatement(stmt);
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed", sqlException);
        }
    }

    //Feladat: adjuk vissza a paraméterül kapott dátum előtti activity-ket egy listában. A paraméter lehet LocalDateTime is, úgy könnyebb!
    public List<Activity> activitiesBeforeDate(LocalDate date) {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where start_time < ?")) {

            LocalDateTime actualDate = date.atTime(0, 0); //LocalDateTime ->LocalDate
            stmt.setTimestamp(1, Timestamp.valueOf(actualDate));
            return selectByPreparedStatement(stmt);

        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("Connection failed", sqlException);
        }
    }

}


