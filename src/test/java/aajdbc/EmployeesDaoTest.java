package aajdbc;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDaoTest {

    private EmployeesDao employeesDao;

    @BeforeEach
    public void init(){
        MariaDbDataSource dataSource;
        try{
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        }
        catch (SQLException se){
            throw new IllegalStateException("Cannot create datasource", se);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        employeesDao = new EmployeesDao(dataSource);
    }

    @Test
    public void testInsert(){
        employeesDao.createEmployee("John Doe");
        assertEquals(Arrays.asList("John Doe"), employeesDao.listEmployeeNames());
    }

    @Test
    public void testInsertMoreNames(){
        employeesDao.createEmployee("John Doe");
        employeesDao.createEmployee("Jane Doe");
        employeesDao.createEmployee("Jack Doe");
        assertEquals(Arrays.asList("Jack Doe", "Jane Doe", "John Doe"), employeesDao.listEmployeeNames());
    }
}