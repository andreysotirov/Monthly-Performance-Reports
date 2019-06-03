package com.andrewsotirov.entity;

import java.util.List;

//entity class for data-file.json
public class DataEntity {
    private String name;
    private Integer totalSales;
    private List<DataEntity> data;
    private Integer salesPeriod;
    private Double experienceMultiplier;


    public DataEntity(String name, Integer totalSales, List<DataEntity> data, Integer salesPeriod, Double experienceMultiplier) {
        this.name = name;
        this.totalSales = totalSales;
        this.data = data;
        this.salesPeriod = salesPeriod;
        this.experienceMultiplier = experienceMultiplier;
    }

    public DataEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Integer totalSales) {
        this.totalSales = totalSales;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public Integer getSalesPeriod() {
        return salesPeriod;
    }

    public void setSalesPeriod(Integer salesPeriod) {
        this.salesPeriod = salesPeriod;
    }

    public Double getExperienceMultiplier() {
        return experienceMultiplier;
    }

    public void setExperienceMultiplier(Double experienceMultiplier) {
        this.experienceMultiplier = experienceMultiplier;
    }

}
