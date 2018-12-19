package com.stackroute.maverick.springbootzuulgatwayproxy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UiController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String redirect() {
        System.out.println("Inside zuul controller");
        return "forward:/restaurant/";
    }
}
