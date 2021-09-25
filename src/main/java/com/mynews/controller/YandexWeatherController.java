package com.mynews.controller;

import com.mynews.model.weather.yandex.Weather;

import com.mynews.model.weather.yandex.timesofday.Day;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.function.client.WebClient;

@Controller
public class YandexWeatherController {

    @GetMapping("/weather")
    public String getWeather(ModelMap model) {
        WebClient webClient = WebClient.create();
        Weather weather = webClient.get()
                .uri("https://api.weather.yandex.ru/v2/forecast/?lat=55.75396&lon=37.620393")
                .header("X-Yandex-API-Key","72af6f15-1b5f-4ba7-9d3f-7870567ab8c9")
                .exchange()
                .block()
                .bodyToMono(Weather.class)
                .block();
        model.addAttribute("weather", weather);
        return "weather";
    }

    public static void main(String[] args) {
        Day weather = new Day();
        weather.setCondition("-");
        weather.setTempMin(4L);
        weather.setTempMax(26L);
        weather.setFeelsLike(1L);
        weather.setPrecProb(7L);
       // weather.
    }
}
