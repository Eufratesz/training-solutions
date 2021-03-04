package jdbc.simpleupdate;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDao {

    private DataSource dataSource;

    public EmployeesDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void createEmployee(String name) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("insert into employees(emp_name) values (?)")) {
            stmt.setString(1, name);
            stmt.executeUpdate();
        } catch (SQLException se) {
            throw new IllegalStateException("cannot insert", se);
        }
    }

    public List<String> listEmployeesNames() {
        try (
                Connection conn = dataSource.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select emp_name from employees")
                ) {
            List<String>names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("emp_name");
                names.add(name);
            }
            return names;

        }
        catch (SQLException se) {
            throw new IllegalStateException("cannot select employees", se);
        }

    }

    public String findEmployeeNameById(long id){
        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement("select emp_name form employees where id = ?");

                ) {
            ps.setLong(1, id);

            return selectNameByPreparedStatememt(ps);
        }
        catch (SQLException sqle) {
            throw new IllegalStateException("cannot querry", sqle);
        }
    }

    private String selectNameByPreparedStatememt(PreparedStatement ps){
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                String name = rs.getString("emp_name");
                return name;
            }
            throw new IllegalArgumentException("not found");
        }
        catch (SQLException sqle) {
            throw new IllegalStateException("cannot query", sqle);
        }

    }

}
