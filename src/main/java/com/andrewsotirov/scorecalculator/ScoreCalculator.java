package com.andrewsotirov.scorecalculator;

import com.andrewsotirov.entity.DataEntity;
import com.andrewsotirov.entity.ReportEntity;
import com.andrewsotirov.reader.DataReader;
import com.andrewsotirov.reader.DataReaderImpl;
import com.andrewsotirov.reader.ReportReader;
import com.andrewsotirov.reader.ReportReaderImpl;

import java.util.ArrayList;
import java.util.List;

//Calculate and validate score
public class ScoreCalculator  {

    private DataReader dataReader = new DataReaderImpl();
    private ReportReader reportReader = new ReportReaderImpl();

    private List<DataEntity> data = dataReader.dataMapper().getData();
    private ReportEntity report = reportReader.reportMapper();



    public List<String[]> calculateScore() {

        List<String[]> rows = new ArrayList<String[]>();
        for (int i = 0; i < data.size(); i++) {

            //Check if UseExperienceMultiplier true
            if (report.getUseExperienceMultiplier()) {
                Double result = (data.get(i).getTotalSales() / data.get(i).getSalesPeriod()) *
                        data.get(i).getExperienceMultiplier();

                //Check if SalesPeriod is <= than PeriodLimit && result is >= TopPerformersThreshold
                if (data.get(i).getSalesPeriod() <= report.getPeriodLimit()
                        && result >= report.getTopPerformersThreshold()) {
                    rows.add(new String[]{data.get(i).getName(), result.toString()});
                }

            } else {

                //Check if SalesPeriod is <= than PeriodLimit && result is >= TopPerformersThreshold
                Double result = (double) (data.get(i).getTotalSales() / data.get(i).getSalesPeriod());
                if (data.get(i).getSalesPeriod() <= report.getPeriodLimit()
                        && result >= report.getTopPerformersThreshold()) {
                    rows.add(new String[]{data.get(i).getName(), result.toString()});

                }
            }
        }
        return rows;
    }


}
