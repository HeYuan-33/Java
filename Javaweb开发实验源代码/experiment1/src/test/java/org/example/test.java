package org.example;

import cuit.t.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        user male = (user) context.getBean("user");
        male.pay();
        male.receive();
    }
}
