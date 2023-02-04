package paxy.p5q4;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeResutlSetExtractor  implements ResultSetExtractor<List<Employee>> {
    public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Employee> employeeList = new ArrayList<Employee>();
        while (rs.next()){
            Employee employee = new Employee(rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3));
            employeeList.add(employee);
        }
        return employeeList;
    }
}
