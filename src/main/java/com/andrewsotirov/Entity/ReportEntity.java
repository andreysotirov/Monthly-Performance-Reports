package com.andrewsotirov.Entity;

//Entity class for report-definition.json
public class ReportEntity {

    private Integer topPerformersThreshold;
    private Boolean useExperienceMultiplier;
    private Integer periodLimit;

    public ReportEntity() {
    }

    public ReportEntity(Integer topPerformersThreshold, Boolean useExperienceMultiplier, Integer periodLimit) {
        this.topPerformersThreshold = topPerformersThreshold;
        this.useExperienceMultiplier = useExperienceMultiplier;
        this.periodLimit = periodLimit;
    }

    public Integer getTopPerformersThreshold() {
        return topPerformersThreshold;
    }

    public void setTopPerformersThreshold(Integer topPerformersThreshold) {
        this.topPerformersThreshold = topPerformersThreshold;
    }

    public Boolean getUseExperienceMultiplier() {
        return useExperienceMultiplier;
    }

    public void setUseExperienceMultiplier(Boolean useExperienceMultiplier) {
        this.useExperienceMultiplier = useExperienceMultiplier;
    }

    public Integer getPeriodLimit() {
        return periodLimit;
    }

    public void setPeriodLimit(Integer periodLimit) {
        this.periodLimit = periodLimit;
    }
}
