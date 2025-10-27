package com.example.SpringSecurityJWT.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String greet(HttpServletRequest request)
    {
        return "Hare Krishna " + request.getSession().getId();
    }
}
