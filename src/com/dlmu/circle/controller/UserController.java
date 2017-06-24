package com.dlmu.circle.controller;

import com.dlmu.circle.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by cf on 2017/5/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {
/*
    为了使用cookie,使用servlet Api
 */
    @RequestMapping("/login")
    public String login(HttpServletRequest request,HttpServletResponse response){
        //tomcat7对cookie的中文有乱码问题
        System.out.println("----登录验证---");
        String userName=request.getParameter("userName");
        String password=request.getParameter("password");
        Cookie cookie=new Cookie("user",userName+"-"+password);
        cookie.setMaxAge(1*60*60*24*7);
        User currentUser=new User(userName,password);
        response.addCookie(cookie);
        HttpSession session=request.getSession();
        session.setAttribute("currentUser", currentUser);
        return "redirect:/jsp/main.jsp";
    }
    /*@RequestMapping("/ajax")
    public @ResponseBody User ajax(){
        User user=new User("zhangsan","123");
        return user;
    }*/


}
