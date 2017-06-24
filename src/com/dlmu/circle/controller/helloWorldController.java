package com.dlmu.circle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cf on 2017/5/24.
 */
@Controller
public class helloWorldController {
    @RequestMapping("/helloWorld")
    public String helloWorld(Model model){
        model.addAttribute("message","springMVC你好");
        return "helloWorld";
    }
}
