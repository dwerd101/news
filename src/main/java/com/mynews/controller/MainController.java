package com.mynews.controller;

import com.mynews.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/terms")
    public String getPageTerms() {
        return "terms";
    }

    @GetMapping("/dynamic")
    public String getPageDynamic(@RequestParam("string") String string, ModelMap modelMap ) {
        modelMap.addAttribute("word",string);
        modelMap.addAttribute("person",

                Person.builder()
                .lastName("test")
                .middleName("tes2")
                .name("test1")
                .build()
        );
        return "runningstring";
    }

}
