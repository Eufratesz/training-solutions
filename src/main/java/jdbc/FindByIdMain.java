package jdbc;

import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FindByIdMain {

    public void selectNameByPreparedStatement(PreparedStatement ps){
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                String name = rs.getString("emp_name");
                System.out.println(name);
            }
            throw new IllegalArgumentException ("Not found");
        } catch (SQLException sqle) {
            throw new IllegalStateException("cannot query", sqle);
        }
    }

    public void selectNameById(DataSource ds, Long id) {
        try (Connection conn = ds.getConnection();
             PreparedStatement ps = conn.prepareStatement("select emp_name from employees where id = ?");
        ) {
            ps.setLong(1, id);
            selectNameByPreparedStatement(ps);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query", sqle);
        }
    }

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

        new FindByIdMain().selectNameById(dataSource, 2L);


    }
}
