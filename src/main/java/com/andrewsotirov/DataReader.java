package com.andrewsotirov;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DataReader {

    ObjectMapper objectMapper = new ObjectMapper();
    DataEntity dataEntity;

    {
        try {
            dataEntity = objectMapper.readValue(new File("data-file.json"), DataEntity.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
