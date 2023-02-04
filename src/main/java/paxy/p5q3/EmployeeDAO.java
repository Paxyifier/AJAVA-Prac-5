package paxy.p5q3;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAO {
    JdbcTemplate jdbcTemplate;
    public EmployeeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public List<Employee> getEmployees(final String name){
        String query = "SELECT * FROM employee WHERE name=?";
        return jdbcTemplate.query(query, new PreparedStatementSetter() {
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1,name);
            }
        },new EmployeeRowMapper());
    }
}
