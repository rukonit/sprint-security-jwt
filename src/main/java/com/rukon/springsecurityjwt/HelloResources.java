package com.rukon.springsecurityjwt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloResources {
    @RequestMapping({"/hello"})
    public String hello() {
        return "Hello World";
    }
}
