package com.mynews.mapper.impl;


import com.mynews.mapper.Mapper;
import com.mynews.model.News;
import com.mynews.model.NewsFields;
import com.mynews.model.dto.NewsDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class MeduzaNewsMapperImpl implements Mapper<NewsDTO, News> {

    @Override
    public News toDTO(NewsDTO newsJson) {
        List<NewsFields> newsFieldsList = new ArrayList<>();
        for (Map.Entry<String,Map<String,Object>> maps : newsJson.getDocuments().entrySet()) {
            NewsFields newsFields = new NewsFields();
            for (Map.Entry<String,Object> newsFieldsMapEntry: maps.getValue().entrySet()) {
                String key = newsFieldsMapEntry.getKey();
                switch (key) {
                    case "url":
                        newsFields.setUrl((String) newsFieldsMapEntry.getValue());
                        break;
                    case "title":
                        newsFields.setTitle((String) newsFieldsMapEntry.getValue());
                        break;
                    case "share_image_url":
                        newsFields.setShareImageUrl((String) newsFieldsMapEntry.getValue());
                        break;
                    case "pub_date":
                        newsFields.setPubDate(LocalDate.parse((String) newsFieldsMapEntry.getValue()));
                        break;
                }
            }
            newsFieldsList.add(newsFields);
        }
       return new News(newsFieldsList);
    }

}
