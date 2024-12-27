package org.example.experiment2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    // 用来存储所有注册的用户
    private List<User> userList = new ArrayList<>();

    // 处理POST请求，提交注册表单
    @PostMapping("/register")
    public String registUser1(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd, @RequestParam("uage") int uage, Model model) {
        User user = new User();
        user.setUname(uname);
        user.setUpwd(upwd);
        user.setUage(uage);
        userList.add(user); // 将注册的用户添加到用户列表
        model.addAttribute("user", user);
        return "userinfo"; // 跳转到userinfo.html 页面
    }

    // 使用ModelAndView
    @PostMapping("/register2")
    public ModelAndView registUser2(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd, @RequestParam("uage") int uage) {
        User user = new User();
        user.setUname(uname);
        user.setUpwd(upwd);
        user.setUage(uage);
        userList.add(user); // 将注册的用户添加到用户列表
        ModelAndView mav = new ModelAndView("userinfo");
        mav.addObject("user", user);
        return mav;
    }

    // 使用@ModelAttribute
    @PostMapping("/register3")
    public String registUser3(@ModelAttribute User user, Model model) {
        userList.add(user); // 将注册的用户添加到用户列表
        model.addAttribute("user", user);
        return "userinfo"; // 跳转到userinfo.html 页面
    }

    // 显示注册页面的 GET 请求
    @GetMapping("/register-form")
    public String showRegisterForm() {
        return "register"; // 返回 register.html 页面
    }

    // 显示用户列表
    @GetMapping("/userlist")
    @ResponseBody
    public List<User> getUsers() {
        return userList;  // 返回所有注册的用户
    }
}