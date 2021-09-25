package com.mynews.model.weather.yandex;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mynews.model.weather.yandex.timesofday.Parts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Forecast {
    @JsonProperty("date")
    private String date;
    @JsonProperty("sunrise")
    private String sunrise;
    @JsonProperty("sunset")
    private String sunset;
    @JsonProperty("parts")
    private Parts parts;
}
