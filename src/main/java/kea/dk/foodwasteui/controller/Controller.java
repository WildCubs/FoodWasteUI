package kea.dk.foodwasteui.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {


    @GetMapping("/")
    public String index() {
        return "html/index";
    }

    @GetMapping("/home")
    public String home() { return "html/index"; }

    @GetMapping("/reportSurplus")
    public String report() {
        return "html/reportSurplus";
    }

    @GetMapping("/viewDeliveries")
    public String delivery() { return "html/viewDeliveries"; }
}
