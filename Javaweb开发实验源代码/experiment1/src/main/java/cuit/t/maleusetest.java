package cuit.t;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class maleusetest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
       user male= (user) context.getBean("user");
        male.pay();
        male.receive();
    }
}
