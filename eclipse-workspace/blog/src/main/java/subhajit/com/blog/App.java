package subhajit.com.blog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle vehicle =(Vehicle)context.getBean("vehicle");
        Vehicle bike =(Vehicle)context.getBean("bike");
        vehicle.drive();
        bike.drive();
        Tyre tyre=(Tyre)context.getBean("tyre");
        System.out.println(tyre);
    }
}
