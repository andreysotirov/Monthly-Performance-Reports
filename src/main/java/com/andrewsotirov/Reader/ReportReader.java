package com.andrewsotirov.Reader;

import com.andrewsotirov.Entity.ReportEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

//Read from report-definition.json
public class ReportReader {

    private ObjectMapper objectMapper = new ObjectMapper();
    private ReportEntity reportEntity;

    public ReportEntity reportMapper() {
        try {
            reportEntity = objectMapper.readValue(new File("json/report-definition.json"), ReportEntity.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reportEntity;
    }
}
