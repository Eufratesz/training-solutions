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


    public Activity insertActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, activity_desc, activity_type) values (?,?,?)", Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
            Activity result = getIdFromStatement(activity, stmt);
            insertActivityTrackPoints(activity.getTrackPoints(), result.getId());

            return result;

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect", sqlException);
        }
    }


    private void insertActivityTrackPoints(List<TrackPoint> trackPoints, long activityId){
        try(Connection conn = dataSource.getConnection()){
            conn.setAutoCommit(false);

        try(PreparedStatement stmt = conn.prepareStatement("insert into track_points(act_time, lat, lon, activity_id) values (?,?,?,?)")){
            for(TrackPoint trackPoint : trackPoints){
                if(!isValidLatLon(trackPoint.getLat(), trackPoint.getLon())){
                    throw new IllegalArgumentException("invalid lat or lon");
                }
                stmt.setDate(1, Date.valueOf(trackPoint.getTime()));
                stmt.setDouble(2, trackPoint.getLat());
                stmt.setDouble(3, trackPoint.getLon());
                stmt.setLong(4, activityId);
                stmt.executeUpdate();
            }
            conn.commit();
            }catch (IllegalArgumentException iae){
            conn.rollback();

        }

        }catch (SQLException sqlException){
            throw new IllegalStateException("Cannot connect", sqlException);
        }
    }

    private boolean isValidLatLon(double lat, double lon){
        if(lat> 90 || lat < -90){
            return false;
        }
        if (lat> 180 || lon < -180){
            return false;
        }
        return true;
    }


    private Activity getIdFromStatement(Activity activity, PreparedStatement stmt) throws SQLException {
        try(ResultSet rs = stmt.getGeneratedKeys()) {
            if (rs.next()) {
                long id = rs.getLong(1);
                return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());
            }
        }
        throw new IllegalStateException("cannot get key");
    }

//    public String createStatementForMoreInsert(int numberOfElements){
//        StringBuilder sb = new StringBuilder("insert into activities(start_time, activity_desc, activity_type) values");
//
//        for(int i =0; i<numberOfElements; i++){
//            sb.append("(?,?,?)");
//        }
//        return sb.toString();
//
//    }

    public Activity selectById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt1= conn.prepareStatement("select * from activities where id = ?");
             PreparedStatement stmt2= conn.prepareStatement("select * from track_points where activity_id = ?")) {

            stmt1.setLong(1, id);
            List<Activity> result = selectActivityByPreparedStatement(stmt1);
            if (result.size() == 1) {
                stmt2.setLong(1, id);
                List<TrackPoint>resultPoints= selectTrackPointsByPreparedStatement(stmt2);
                result.get(0).addTrackPoints(resultPoints);
                return result.get(0);
            }
            throw new IllegalArgumentException("not found!");

        } catch (SQLException sqlException) {
            throw new IllegalStateException("cannot connect!", sqlException);
        }

    }

    private List<Activity> selectActivityByPreparedStatement(PreparedStatement stmt) {
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

    private List<TrackPoint> selectTrackPointsByPreparedStatement(PreparedStatement stmt) {
        List<TrackPoint> result = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                TrackPoint trackPoint = new TrackPoint(rs.getLong("id"), rs.getDate("act_time").toLocalDate(), rs.getDouble("lat"), rs.getDouble("lon"));
                result.add(trackPoint);
            }
            return result;
        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("wrong statement", sqlException);
        }

    }

    public List<Activity> selectAllActivities() {

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities")) {
            return selectActivityByPreparedStatement(stmt);

        } catch (SQLException sqlException) {
            throw new IllegalArgumentException("Connection failed", sqlException);
        }
    }

    public List<Activity> selectActivitiesByType(ActivityType type) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where activity_type = ?")) {
            stmt.setString(1, type.toString());
            return selectActivityByPreparedStatement(stmt);
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
            return selectActivityByPreparedStatement(stmt);

        } catch (SQLException sqlException) {
            throw new IllegalStateException("Connection failed", sqlException);
        }
    }

}


