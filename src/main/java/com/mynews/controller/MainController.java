package com.mynews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getPageHelloWorld() {
        return "helloworld";
    }
    @GetMapping("/privacy")
    public String getPagePrivacy() {
        return "privacy";
    }

}
