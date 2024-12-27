package edu.cuit.ai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName : myController
 * @Description :
 * @Author : ZJ
 * @Date: 2024-12-12 17:25
 */
@Controller
public class myController {
    // 该方法的访问路径是/h1
    @RequestMapping("/h1")
    public String helloMVC(){
        System.out.println("hello SpringMVC！");
        return "OK";
    }
    @RequestMapping("/h2")
    public String helloMVC2(@RequestParam("username") String username){
        System.out.println(username);
        return "OK";

    }
}




