package activityTracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    public void init(){

        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect", sqlException);
        }

//        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
//        flyway.clean();
//        flyway.migrate();


        Flyway flyway = Flyway.configure()
                .locations("/db/migration/activitytracker") //így lehet megadni, melyiket töltse be.
                .dataSource(dataSource)
                .load();
        flyway.clean();
        flyway.migrate();

        activityDao = new ActivityDao(dataSource);
    }

    @Test
    void insertElementTest(){
        Activity activity = new Activity(LocalDateTime.of(2021, 02, 23, 10, 21), "Biking in Zemplén", ActivityType.BIKING);
        activityDao.insertActivity(activity);

        assertEquals(activityDao.selectAllActivities().size(), 4);
    }

    @Test
    void selectByTypeTest(){
        assertEquals(activityDao.selectActivitiesByType(ActivityType.BIKING).size(), 1);
    }

    @Test
    void beforeDateTest(){
        assertEquals(2, activityDao.activitiesBeforeDate(LocalDate.of(2021, 2, 12)).size());
    }



}