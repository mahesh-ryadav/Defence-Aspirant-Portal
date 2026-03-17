package com.defence.portal.examportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "attempt_answers")
public class AttemptAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "attempt_id")
    private ExamAttempt attempt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @NotBlank(message = "Selected option key is required")
    private String selectedOptionKey;

    private boolean isCorrect;

    // Constructors
    public AttemptAnswer() {}

    // Getters
    public Long getId() {
        return id;
    }

    public ExamAttempt getAttempt() {
        return attempt;
    }

    public Question getQuestion() {
        return question;
    }

    public String getSelectedOptionKey() {
        return selectedOptionKey;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setAttempt(ExamAttempt attempt) {
        this.attempt = attempt;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setSelectedOptionKey(String selectedOptionKey) {
        this.selectedOptionKey = selectedOptionKey;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
}
