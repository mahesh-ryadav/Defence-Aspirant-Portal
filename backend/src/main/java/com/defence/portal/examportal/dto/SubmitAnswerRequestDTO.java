package com.defence.portal.examportal.dto;

public class SubmitAnswerRequestDTO {
    private Long attemptId;
    private Long questionId;
    private String selectedOptionKey;

    // Constructors
    public SubmitAnswerRequestDTO() {}

    // Getters
    public Long getAttemptId() {
        return attemptId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public String getSelectedOptionKey() {
        return selectedOptionKey;
    }

    // Setters
    public void setAttemptId(Long attemptId) {
        this.attemptId = attemptId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public void setSelectedOptionKey(String selectedOptionKey) {
        this.selectedOptionKey = selectedOptionKey;
    }
}
