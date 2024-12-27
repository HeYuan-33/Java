package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.time.MonthDay.now;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "app.xml");
        fruit fruit = (fruit)context.getBean("fruit");
        System.out.println(fruit.sayName());

    }
}
