package jdbc.generatedid;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDaoTest {
    EmployeesDao employeesDao;

    @BeforeEach
    public void init() {

        MariaDbDataSource dataSource;

        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot connect", sqlException);
        }



        Flyway flyway = Flyway.configure()
                .locations("/db/migration/employees") //így lehet megadni, melyiket töltse be.
                .dataSource(dataSource)
                .load();
        flyway.clean();
        flyway.migrate();

        employeesDao = new EmployeesDao(dataSource);
    }

    @Test
    void testInsert(){
        employeesDao.createEmployee("John Doe");
        assertEquals(Arrays.asList("John Doe"), employeesDao.listEmployeeNames());
    }

    @Test
    void testById(){
        //Given
        long id = employeesDao.createEmployee("Jack Doe");

        //When
        String name = employeesDao.findEmployeeNameById(id);
        //Then
        assertEquals("Jack Doe", name);
    }
}