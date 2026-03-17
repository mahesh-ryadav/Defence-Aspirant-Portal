package com.defence.portal.examportal.dto;

public class ExamDTO {
    private Long id;
    private String title;
    private String description;
    private Integer durationMinutes;
    private Integer totalMarks;
    private Integer passingMarks;
    private boolean negativeMarkingEnabled;
    private boolean active;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Integer getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(Integer durationMinutes) { this.durationMinutes = durationMinutes; }
    public Integer getTotalMarks() { return totalMarks; }
    public void setTotalMarks(Integer totalMarks) { this.totalMarks = totalMarks; }
    public Integer getPassingMarks() { return passingMarks; }
    public void setPassingMarks(Integer passingMarks) { this.passingMarks = passingMarks; }
    public boolean isNegativeMarkingEnabled() { return negativeMarkingEnabled; }
    public void setNegativeMarkingEnabled(boolean negativeMarkingEnabled) { this.negativeMarkingEnabled = negativeMarkingEnabled; }
    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
