package com.defence.portal.examportal.dto;

public class UpdateExamRequestDTO {
    private String title;
    private String description;
    private Integer durationMinutes;
    private Integer totalMarks;
    private Integer passingMarks;
    private Boolean negativeMarkingEnabled;
    private Double negativeMarksPerQuestion;
    private Boolean active;

    // Constructors
    public UpdateExamRequestDTO() {}

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public Integer getTotalMarks() {
        return totalMarks;
    }

    public Integer getPassingMarks() {
        return passingMarks;
    }

    public Boolean getNegativeMarkingEnabled() {
        return negativeMarkingEnabled;
    }

    public Double getNegativeMarksPerQuestion() {
        return negativeMarksPerQuestion;
    }

    public Boolean getActive() {
        return active;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setTotalMarks(Integer totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void setPassingMarks(Integer passingMarks) {
        this.passingMarks = passingMarks;
    }

    public void setNegativeMarkingEnabled(Boolean negativeMarkingEnabled) {
        this.negativeMarkingEnabled = negativeMarkingEnabled;
    }

    public void setNegativeMarksPerQuestion(Double negativeMarksPerQuestion) {
        this.negativeMarksPerQuestion = negativeMarksPerQuestion;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
