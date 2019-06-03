package com.andrewsotirov;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReportReader {

    ObjectMapper objectMapper = new ObjectMapper();
    ReportEntity reportEntity;

    {
        try {
            reportEntity = objectMapper.readValue(new File("report-definition.json"), ReportEntity.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
