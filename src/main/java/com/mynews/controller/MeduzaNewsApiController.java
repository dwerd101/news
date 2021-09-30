package com.mynews.controller;


import com.mynews.mapper.Mapper;
import com.mynews.model.News;
import com.mynews.model.NewsFields;
import com.mynews.model.NewsJson;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class MeduzaNewsApiController {

    @Value("${meduza.news.today}")
    private String meduzaNewsUrl;
    private final Mapper<NewsJson, News> mapper;

    @GetMapping(value = "/news", produces = "application/json;charset=UTF-8")
    public News getNews() {
        WebClient webClient = WebClient.create();
          NewsJson newsJson = webClient.get()
                .uri(meduzaNewsUrl)
                .exchange()
                .block()
                .bodyToMono(NewsJson.class)
                .block();

          return mapper.toDTO(newsJson) ;
    }
}
