package com.defence.portal.examportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "exam_attempts")
public class ExamAttempt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @NotNull(message = "User ID is required")
    private Long userId;

    @NotNull(message = "Start time is required")
    private LocalDateTime startTime;

    private LocalDateTime endTime;

    @Enumerated(EnumType.STRING)
    private AttemptStatus status;

    private Double score;

    // Rel: One ExamAttempt -> Many AttemptAnswers
    @OneToMany(mappedBy = "attempt", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AttemptAnswer> answers;

    // Rel: One ExamAttempt -> One ExamResult
    @OneToOne(mappedBy = "attempt", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ExamResult result;

    // Constructors
    public ExamAttempt() {}

    // Getters
    public Long getId() {
        return id;
    }

    public Exam getExam() {
        return exam;
    }

    public Long getUserId() {
        return userId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public AttemptStatus getStatus() {
        return status;
    }

    public Double getScore() {
        return score;
    }

    public List<AttemptAnswer> getAnswers() {
        return answers;
    }

    public ExamResult getResult() {
        return result;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setStatus(AttemptStatus status) {
        this.status = status;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setAnswers(List<AttemptAnswer> answers) {
        this.answers = answers;
    }

    public void setResult(ExamResult result) {
        this.result = result;
    }
}
