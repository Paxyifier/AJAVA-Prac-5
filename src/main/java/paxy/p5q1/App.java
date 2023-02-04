package paxy.p5q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        JdbcTemplate jdbcTemplate = context.getBean("JdbcTemplate", JdbcTemplate.class);
        EmployeeDAO employeeDAO = new EmployeeDAO(jdbcTemplate);
        Employee employee1 = new Employee(1,"Prathamesh Ingale",60000.00);
        Employee employee2 = new Employee(2,"Clark Kent",25000.00);
        Employee employee3 = new Employee(3,"Chloe Sullivan",50000.00);
        Employee employee4 = new Employee(4,"Lois Lane",75000.00);
        System.out.println("Employee Inserted: "+employeeDAO.insertEmployee(employee1)+employee1);
        System.out.println("Employee Inserted: "+employeeDAO.insertEmployee(employee2)+employee2);
        System.out.println("Employee Inserted: "+employeeDAO.insertEmployee(employee3)+employee3);
        System.out.println("Employee Inserted: "+employeeDAO.insertEmployee(employee4)+employee4);
//        Update
        System.out.println("Increment of Employee 1");
        Employee updatedEmployee = new Employee(employee1.getId(), employee1.getName(), 80000.00);
        System.out.println("Employee Updated: "
                +employeeDAO.updateEmployee(employee1,updatedEmployee)
                +employee1);
//        deletion
        System.out.println("Employee Deleted: "
                +employeeDAO.deleteEmployee(employee3)
                +employee3);
    }

}
