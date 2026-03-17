package com.defence.portal.examportal.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "options")
public class Option {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @NotBlank(message = "Option key is required")
    private String optionKey; // A, B, C, D

    @NotBlank(message = "Option text is required")
    private String optionText;

    // Constructors
    public Option() {}

    // Getters
    public Long getId() {
        return id;
    }

    public Question getQuestion() {
        return question;
    }

    public String getOptionKey() {
        return optionKey;
    }

    public String getOptionText() {
        return optionText;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public void setOptionKey(String optionKey) {
        this.optionKey = optionKey;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }
}
