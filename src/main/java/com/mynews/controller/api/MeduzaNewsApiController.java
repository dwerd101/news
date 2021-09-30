package com.mynews.controller.api;


import com.mynews.mapper.Mapper;
import com.mynews.model.News;
import com.mynews.model.dto.NewsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequiredArgsConstructor
public class MeduzaNewsApiController {

    @Value("${meduza.news.today}")
    private String meduzaNewsUrl;
    private final Mapper<NewsDTO, News> mapper;

    @GetMapping(value = "/news", produces = "application/json;charset=UTF-8")
    public News getNews() {
        WebClient webClient = WebClient.create();
          NewsDTO newsJson = webClient.get()
                .uri(meduzaNewsUrl)
                .exchange()
                .block()
                .bodyToMono(NewsDTO.class)
                .block();

          return mapper.toDTO(newsJson) ;
    }



}
