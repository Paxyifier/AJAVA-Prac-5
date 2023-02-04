package paxy.p5q0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String[] args) {
        System.out.println("JDBC Program");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        JdbcTemplate template = context.getBean("JdbcTemplate", JdbcTemplate.class);

        String query = "insert into student(id,name,city) values(?,?,?)";

        int result = template.update(query, 14, "Teena", "Chennai");
        System.out.println("Number of rows inserted..." + result);
    }
}
