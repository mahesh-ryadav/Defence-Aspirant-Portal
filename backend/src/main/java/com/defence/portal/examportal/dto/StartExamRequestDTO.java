package com.defence.portal.examportal.dto;

public class StartExamRequestDTO {
    private Long examId;
    private Long userId;

    // Getters and Setters
    public Long getExamId() { return examId; }
    public void setExamId(Long examId) { this.examId = examId; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
}
