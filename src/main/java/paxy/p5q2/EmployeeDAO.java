package paxy.p5q2;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class EmployeeDAO {
    JdbcTemplate jdbcTemplate;
    public EmployeeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public List<Employee> getAllEmployees(){
        String query = "SELECT * FROM employee";
        return jdbcTemplate.query(query, new EmployeeRowMapper());
    }
}
