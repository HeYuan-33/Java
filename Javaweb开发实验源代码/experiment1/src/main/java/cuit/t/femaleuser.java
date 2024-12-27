package cuit.t;

import org.springframework.stereotype.Component;

@Component
public class femaleuser implements user {
    public void pay() {
        System.out.println("femaleuser类：你好，赵老师");
    }

    public void receive() {
        System.out.println("femaleuser:hello 赵老师");
    }
}
