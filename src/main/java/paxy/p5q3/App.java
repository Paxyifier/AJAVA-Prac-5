package paxy.p5q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        JdbcTemplate jdbcTemplate = context.getBean("JdbcTemplate", JdbcTemplate.class);
        EmployeeDAO employeeDAO = new EmployeeDAO(jdbcTemplate);
    }
}
