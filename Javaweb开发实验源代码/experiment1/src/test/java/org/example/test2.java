package org.example;

import cuit.t.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        user female = (user) context.getBean("user2");
        female.pay();
        female.receive();
    }
}
