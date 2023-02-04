package paxy.p5q4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        JdbcTemplate jdbcTemplate = context.getBean("JdbcTemplate", JdbcTemplate.class);
        EmployeeDAO employeeDAO = new EmployeeDAO(jdbcTemplate);
        List<paxy.p5q4.Employee> employeeList = employeeDAO.getAllEmployees();
        ListIterator<Employee> employeeListIterator = employeeList.listIterator();
        System.out.println("Employees: ");
        while (employeeListIterator.hasNext()){
            System.out.println(employeeListIterator.next());
        }
    }

}
