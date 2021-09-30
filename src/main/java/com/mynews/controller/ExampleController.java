/*
package com.mynews.controller;

import com.mynews.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/test")
    public Person getHello(@RequestParam(value = "name", required = false, defaultValue = "Roman") String name,
                           @RequestParam(value = "lastname", required = false, defaultValue = "Test") String lastname) {
        return Person.builder().name(name).lastName(lastname).build();
    }
}
*/
