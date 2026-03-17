package com.defence.portal.examportal.dto;

public class ExamResultDTO {
    private Integer totalQuestions;
    private Integer correctCount;
    private Integer incorrectCount;
    private Integer unattemptedCount;
    private Double finalScore;
    private String resultStatus;

    // Getters and Setters
    public Integer getTotalQuestions() { return totalQuestions; }
    public void setTotalQuestions(Integer totalQuestions) { this.totalQuestions = totalQuestions; }
    public Integer getCorrectCount() { return correctCount; }
    public void setCorrectCount(Integer correctCount) { this.correctCount = correctCount; }
    public Integer getIncorrectCount() { return incorrectCount; }
    public void setIncorrectCount(Integer incorrectCount) { this.incorrectCount = incorrectCount; }
    public Integer getUnattemptedCount() { return unattemptedCount; }
    public void setUnattemptedCount(Integer unattemptedCount) { this.unattemptedCount = unattemptedCount; }
    public Double getFinalScore() { return finalScore; }
    public void setFinalScore(Double finalScore) { this.finalScore = finalScore; }
    public String getResultStatus() { return resultStatus; }
    public void setResultStatus(String resultStatus) { this.resultStatus = resultStatus; }
}
