package jdbc.simpleupdate;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.util.List;

public class EmployeesMain {

    public static void main(String[] args) {
        MariaDbDataSource dataSource;
        try {

            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUser("employees");
            dataSource.setPassword("employees");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not create data source", se);
        }
/*
        for (int i = 0; i < 100; i++) {

            try (
                    Connection conn = dataSource.getConnection();
                    PreparedStatement stmt =
                            conn.prepareStatement("insert into employees(emp_name) values (?)")) {
                stmt.setString(1, "John Doe");
                stmt.executeUpdate();
            } catch (SQLException se) {
                throw new IllegalStateException("Can not insert", se);
            }
        }

 */

        /*
        try(
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from employees")
                ) {
         //   List<String>names = new ArrayList<>();
            while(rs.next()) {
                String name = rs.getString("emp_name");
                System.out.println(name);
             //   names.add(name);
            }
          //  return names;  így is lehetne, de akkor nem Minben megírva (void)
        }
        catch (SQLException se) {
            throw new IllegalStateException("cannot select employees", se);
        }

         */


        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        EmployeesDao employeesDao = new EmployeesDao(dataSource);
        employeesDao.createEmployee("Jane Doe");

        List<String>names = employeesDao.listEmployeesNames();
        System.out.println(names);

        String name = employeesDao.findEmployeeNameById(1L);
        System.out.println(name);
    }
}
