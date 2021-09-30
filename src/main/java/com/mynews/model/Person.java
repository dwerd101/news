package com.mynews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
    @JsonProperty("name")
    private String name;

    @SneakyThrows
    public static void main(String[] args) {
        String json = "{\"name\":\"Roman\",\"last_name\":\"Boloban\"}";
        ObjectMapper ObjectMapper = new ObjectMapper();
        Person person = ObjectMapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
