package com.defence.portal.examportal.dto;

public class UpdateQuestionRequestDTO {
    private String questionText;
    private String questionType;
    private Integer marks;
    private String correctAnswerKey;

    // Constructors
    public UpdateQuestionRequestDTO() {}

    // Getters
    public String getQuestionText() {
        return questionText;
    }

    public String getQuestionType() {
        return questionType;
    }

    public Integer getMarks() {
        return marks;
    }

    public String getCorrectAnswerKey() {
        return correctAnswerKey;
    }

    // Setters
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public void setCorrectAnswerKey(String correctAnswerKey) {
        this.correctAnswerKey = correctAnswerKey;
    }
}
