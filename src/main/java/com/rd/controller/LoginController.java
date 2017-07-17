package com.rd.controller;

/**
 * Created by sramalin on 14/07/17.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by sramalin on 31/05/17.
 */

/* Modified by talupu on 10/07/17 to add mapping for create new tickets/users */


@Controller
public class LoginController {

    @RequestMapping(value = "/mylogin", method = RequestMethod.GET)
    public String getIndexPage() {

        return "index";

    }



}

