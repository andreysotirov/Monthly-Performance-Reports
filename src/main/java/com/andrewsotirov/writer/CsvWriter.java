package com.andrewsotirov.writer;

import com.andrewsotirov.scorecalculator.ScoreCalculator;
import com.opencsv.CSVWriter;

import java.io.FileWriter;

//CSV writer class
public class CsvWriter {

    ScoreCalculator scoreCalculator = new ScoreCalculator();

    public void write() throws Exception {

        //Output file name and location
        FileWriter outputFile = new FileWriter("csv/data.csv");

        CSVWriter writer = new CSVWriter(outputFile);

        String[] header = {"Name", "Score"};
        writer.writeNext(header, false);

        writer.writeAll(scoreCalculator.calculateScore(), false);
        writer.close();

    }
}
