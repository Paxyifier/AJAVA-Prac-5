package paxy.p5q2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAO {
    JdbcTemplate jdbcTemplate;
    public List<Employee> getAllEmployees(){
        String query = "SELECT * FROM employee";
        return jdbcTemplate.query(query, new EmployeeRowMapper());
    }
    public EmployeeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
    public int insertEmployee(Employee e){
        String query = "INSERT INTO employee (id, name, salary) values (?,?,?)";
        int result = this.jdbcTemplate.update(query,
                e.getId(),e.getName(),e.getSalary());
        return result;
    }
    public int updateEmployee(Employee eOriginal, Employee eNew){
        String query = "UPDATE employee SET name=?,salary=? WHERE id=?";
        int result = this.jdbcTemplate.update(query,
                eNew.getName(),eNew.getSalary(),eOriginal.getId());
        return result;
    }
    public int deleteEmployee(Employee employee){
        String query = "DELETE FROM employee WHERE id=?";
        int result = this.jdbcTemplate.update(query,employee.getId());
        return result;
    }
}
