package com.andrewsotirov;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ScoreCalculator {

    private DataReader dataReader = new DataReader();
    private ReportReader reportReader = new ReportReader();
    private List<DataEntity> data = dataReader.dataEntity.getData();


    public List<String[]> calculateScore() {

        List<String[]> rows = new ArrayList<String[]>();
        for (int i = 0; i < data.size(); i++) {

            System.out.println(i);
            if (reportReader.reportEntity.getUseExperienceMultiplier()) {
                Double result = (data.get(i).getTotalSales() / data.get(i).getSalesPeriod()) *
                        data.get(i).getExperienceMultiplier();
                if (data.get(i).getSalesPeriod() <= reportReader.reportEntity.getPeriodLimit()
                        && result >= reportReader.reportEntity.getTopPerformersThreshold()) {
                    rows.add(new String[]{data.get(i).getName(), result.toString()});
                }
            } else {
                Double result = (double) (data.get(i).getTotalSales() / data.get(i).getSalesPeriod());
                if (data.get(i).getSalesPeriod() <= reportReader.reportEntity.getPeriodLimit()
                        && result >= reportReader.reportEntity.getTopPerformersThreshold()) {
                    rows.add(new String[]{data.get(i).getName(), result.toString()});
                }
            }
        }
        return rows;
    }

    public void writeAble() throws Exception {

        FileWriter outputFile = new FileWriter("new.csv");

        CSVWriter writer = new CSVWriter(outputFile);
        String[] header = {"Name", "Score"};
        writer.writeNext(header, false);
        writer.writeAll(calculateScore(), false);
        writer.close();

    }
}
