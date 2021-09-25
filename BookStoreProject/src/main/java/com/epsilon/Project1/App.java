package com.epsilon.Project1;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/epsilon/Project1/config.xml");
        
        Order o1 = (Order)ctx.getBean("order1");
        
        System.out.println(o1);
        
        Order o2 = (Order)ctx.getBean("order2");
        
        System.out.println(o2);
        
        Order o3 = (Order)ctx.getBean("order3");
        
        System.out.println(o3);
    }
}
