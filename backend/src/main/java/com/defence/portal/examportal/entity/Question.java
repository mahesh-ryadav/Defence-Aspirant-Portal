package com.defence.portal.examportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @Column(columnDefinition = "TEXT")
    @NotBlank(message = "Question text is required")
    private String questionText;

    @NotBlank(message = "Question type is required")
    private String questionType; // e.g., MCQ, SUBJECTIVE

    @NotNull(message = "Marks are required")
    @Min(value = 1, message = "Marks must be at least 1")
    private Integer marks;

    @NotBlank(message = "Correct answer key is required")
    private String correctAnswerKey;

    private LocalDateTime createdAt;

    // Rel: One Question -> Many Options
    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Option> options;

    // Constructors
    public Question() {}

    // Getters
    public Long getId() {
        return id;
    }

    public Exam getExam() {
        return exam;
    }

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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<Option> getOptions() {
        return options;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

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

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }
}
