package com.defence.portal.examportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "exams")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    private String description;

    @NotNull(message = "Duration is required")
    @Min(value = 1, message = "Duration must be at least 1 minute")
    private Integer durationMinutes;

    @NotNull(message = "Total marks is required")
    @Min(value = 1, message = "Total marks must be generally positive")
    private Integer totalMarks;

    @Min(value = 0, message = "Passing marks must be non-negative")
    private Integer passingMarks;

    private boolean negativeMarkingEnabled;

    @PositiveOrZero(message = "Negative marks cannot be negative number")
    private Double negativeMarksPerQuestion;

    private boolean active;

    private LocalDateTime createdAt;

    // Rel: One Exam -> Many Questions
    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Question> questions;

    // Rel: One Exam -> Many ExamAttempts
    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ExamAttempt> attempts;

    // Constructors
    public Exam() {}

    // Getters
    public Long getId() {
        return id;
    }

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

    public boolean isActive() {
        return active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public List<ExamAttempt> getAttempts() {
        return attempts;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

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

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void setAttempts(List<ExamAttempt> attempts) {
        this.attempts = attempts;
    }
}
