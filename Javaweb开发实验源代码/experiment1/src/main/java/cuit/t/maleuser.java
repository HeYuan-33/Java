package cuit.t;

import org.springframework.stereotype.Component;

@Component
public class maleuser implements user {

   public void pay() {
       System.out.println("maleuserl类:你好，赵老师");
   }

    public void receive() {
        System.out.println("maleuser类：hello 赵老师");
    }
}


