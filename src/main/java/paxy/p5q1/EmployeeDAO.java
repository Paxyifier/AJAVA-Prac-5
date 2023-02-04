package paxy.p5q1;

import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;

public class EmployeeDAO {
    JdbcTemplate jdbcTemplate;

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
