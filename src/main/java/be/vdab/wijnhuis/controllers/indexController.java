package be.vdab.wijnhuis.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/")
public class indexController {


    @GetMapping
    public ModelAndView index() {
        var modelAndView = new ModelAndView("index");

        return modelAndView;
    }
}
