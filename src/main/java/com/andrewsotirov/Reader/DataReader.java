package com.andrewsotirov.Reader;

import com.andrewsotirov.Entity.DataEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

//Read from data-file.json
public class DataReader {

    private ObjectMapper objectMapper = new ObjectMapper();
    private DataEntity dataEntity;

    public DataEntity dataMapper() {
        try {
            dataEntity = objectMapper.readValue(new File("json/data-file.json"), DataEntity.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataEntity;
    }
}
