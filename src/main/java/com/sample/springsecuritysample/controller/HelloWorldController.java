package com.sample.springsecuritysample.controller;

import org.apache.tomcat.util.net.jsse.openssl.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloWorldController {


    @RequestMapping(value = "/adminhomepage", method = RequestMethod.GET)
    public String getHomePage(Model model) {

        org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username


        model.addAttribute("LoggedInUser", name);
        return "myhomepage";

    }

    @RequestMapping(value = "/userhomepage", method = RequestMethod.GET)
    public String getUserHomePage(Model model) {

        org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username


        model.addAttribute("LoggedInUser", name);
        return "userhomepage";

    }

    @RequestMapping(value = "/secondpage", method = RequestMethod.GET)
    public String getUserSecondPage(Model model) {
        org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username

        model.addAttribute("LoggedInUser", name);

        return "secondpage";

    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello1() {
        return "Hello User1!";
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello2() {
        return "myhome";
    }

}
