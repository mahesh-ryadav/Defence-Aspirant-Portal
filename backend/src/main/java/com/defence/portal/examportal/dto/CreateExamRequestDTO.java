package com.defence.portal.examportal.dto;

public class CreateExamRequestDTO {
    private String title;
    private String description;
    private Integer durationMinutes;
    private Integer totalMarks;
    private Integer passingMarks;
    private boolean negativeMarkingEnabled;
    private Double negativeMarksPerQuestion;

    // Constructors
    public CreateExamRequestDTO() {}

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

    public boolean isNegativeMarkingEnabled() {
        return negativeMarkingEnabled;
    }

    public Double getNegativeMarksPerQuestion() {
        return negativeMarksPerQuestion;
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

    public void setNegativeMarkingEnabled(boolean negativeMarkingEnabled) {
        this.negativeMarkingEnabled = negativeMarkingEnabled;
    }

    public void setNegativeMarksPerQuestion(Double negativeMarksPerQuestion) {
        this.negativeMarksPerQuestion = negativeMarksPerQuestion;
    }
}
