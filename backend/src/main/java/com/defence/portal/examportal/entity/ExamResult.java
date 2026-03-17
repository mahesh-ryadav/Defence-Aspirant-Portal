package com.defence.portal.examportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "exam_results")
public class ExamResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attempt_id")
    private ExamAttempt attempt;

    @NotNull
    private Integer totalQuestions;

    @NotNull
    private Integer correctCount;

    private Integer incorrectCount;

    private Integer unattemptedCount;

    private Double finalScore;

    @Enumerated(EnumType.STRING)
    private ResultStatus resultStatus;

    // Constructors
    public ExamResult() {}

    // Getters
    public Long getId() {
        return id;
    }

    public ExamAttempt getAttempt() {
        return attempt;
    }

    public Integer getTotalQuestions() {
        return totalQuestions;
    }

    public Integer getCorrectCount() {
        return correctCount;
    }

    public Integer getIncorrectCount() {
        return incorrectCount;
    }

    public Integer getUnattemptedCount() {
        return unattemptedCount;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setAttempt(ExamAttempt attempt) {
        this.attempt = attempt;
    }

    public void setTotalQuestions(Integer totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public void setCorrectCount(Integer correctCount) {
        this.correctCount = correctCount;
    }

    public void setIncorrectCount(Integer incorrectCount) {
        this.incorrectCount = incorrectCount;
    }

    public void setUnattemptedCount(Integer unattemptedCount) {
        this.unattemptedCount = unattemptedCount;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    public void setResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }
}
