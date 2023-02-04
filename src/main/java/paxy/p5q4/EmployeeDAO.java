package paxy.p5q4;

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
        return jdbcTemplate.query("SELECT * FROM employee", new EmployeeResutlSetExtractor());
    }

}
