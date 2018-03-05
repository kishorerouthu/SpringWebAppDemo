package com.css.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Kishore Routhu on 5/3/18 4:17 PM.
 */
@Controller
public class HelloSpringController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(ModelMap modelMap) {
        return "hello";
    }

    @RequestMapping(value = "/welcome/{username}", method = RequestMethod.GET)
    public ModelAndView welcome(ModelAndView modelAndView, @PathVariable("username") String username) {
        modelAndView.addObject("username", username);
        modelAndView.setViewName("welcome");
        return modelAndView;
    }
}
