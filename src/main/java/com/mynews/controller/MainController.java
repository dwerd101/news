package com.mynews.controller;


import com.mynews.model.News;
import com.mynews.model.dto.NewsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/news/main")
    public String getNews(ModelMap modelMap) {

        WebClient webClient = WebClient.create();
        News news = webClient.get()
                .uri("http://localhost:8001/news")
                .exchange()
                .block()
                .bodyToMono(News.class)
                .block();
        modelMap.addAttribute("news",news.getNewsFields());
        return "mainpage";
    }


    @GetMapping("/mynews")
    public String getPageHelloWorld() {
        return "redirect:/news/main";
    }
    @GetMapping("/privacy")
    public String getPagePrivacy() {
        return "privacy";
    }

    @GetMapping("/terms")
    public String getPageTerms() {
        return "terms";
    }

/*    @GetMapping("/dynamic")
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
    }*/

}
