package aajdbc.activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public void insertActivity(DataSource dataSource, Activity activity) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values(?,?,?)")) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot insert", se);
        }
    }

    public Activity findById(DataSource dataSource, int id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement("select * from activities where id=?")) {
            ps.setLong(1, id);

            return selectActivityTypeByPreparedStatement(ps);
            } catch (SQLException se) {
                throw new IllegalStateException("Cannot connect", se);
            }
        }


    private Activity selectActivityTypeByPreparedStatement(PreparedStatement ps) {
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                Activity activity = new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(), rs.getString("activity_desc"), ActivityType.valueOf(rs.getString("activity_type")));
                return activity;
            }
            throw new IllegalArgumentException("not found");
        } catch (SQLException se) {
            throw new IllegalStateException("Execute failed", se);
        }
    }

    

        public static void main (String[]args){

            MariaDbDataSource dataSource;

            try {
                dataSource = new MariaDbDataSource();
                dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
                dataSource.setUser("activitytracker");
                dataSource.setPassword("activitytracker");
            } catch (SQLException se) {
                throw new IllegalStateException("Cannot connect", se);
            }

            Activity activity1 = new Activity(LocalDateTime.of(2021, 7, 30, 15, 48), "Biking in Mátra", ActivityType.BIKING);
            Activity activity2 = new Activity(LocalDateTime.of(2021, 7, 31, 15, 48), "Running in Mátra", ActivityType.RUNNING);
            Activity activity3 = new Activity(LocalDateTime.of(2021, 7, 31, 16, 48), "Hiking in Mátra", ActivityType.HIKING);

            ActivityTrackerMain atm = new ActivityTrackerMain();
            atm.insertActivity(dataSource, activity1);
            atm.insertActivity(dataSource, activity2);
            atm.insertActivity(dataSource, activity3);


            System.out.println(atm.findById(dataSource, 18));
        }
    }
