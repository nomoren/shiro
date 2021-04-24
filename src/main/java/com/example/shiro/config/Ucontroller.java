package com.example.shiro.config;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ucontroller {


    @RequestMapping("/toLogin")
    public  String  tologoin(){
        System.out.println("ssss");
        return  "login.html";

    }

    @RequestMapping("/Login")
    public  String  Login(String name,String pwd){
        System.out.println(name);
        System.out.println(pwd);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken UsernamePasswordToken =new UsernamePasswordToken(name,pwd);
        subject.login(UsernamePasswordToken);

        return  "login";

    }
}
