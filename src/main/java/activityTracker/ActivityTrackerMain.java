package activityTracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;


import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect", sqlException);
        }

        Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 21), "Biking in Zemplén", ActivityType.BIKING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 02, 23, 10, 21), "Hiking in Zemplén", ActivityType.HIKING);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 02, 23, 10, 21), "Running in Zemplén", ActivityType.RUNNING);


        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();


        ActivityDao activityDao = new ActivityDao(dataSource);

//        System.out.println(activityDao.selectById(3));
//        System.out.println(activityDao.selectAllActivities());
//        System.out.println(activityDao.selectActivitiesByType(ActivityType.BIKING));

    }


}
    /*
Ez először kimaradt, és nem futott a DB:(
use mysql;
create schema if not exists activitytracker default character set utf8 collate utf8_hungarian_ci;

create user 'activitytracker'@'localhost' identified by 'activitytracker';
grant all on *.* to 'activitytracker'@'localhost';


   Táblázat létrehozása: Ezt kell beszúrni a HeidiSQL-be:

CREATE TABLE activities (id BIGINT AUTO_INCREMENT,
                         start_time TIMESTAMP,
                         activity_desc VARCHAR(255),
                         activity_type VARCHAR(255),
                         PRIMARY KEY (id));

     */

