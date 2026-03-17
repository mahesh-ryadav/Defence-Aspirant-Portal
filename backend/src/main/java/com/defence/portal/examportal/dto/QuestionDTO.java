package com.defence.portal.examportal.dto;

import java.util.List;

public class QuestionDTO {
    private Long id;
    private String questionText;
    private String questionType;
    private Integer marks;
    private List<OptionDTO> options;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getQuestionText() { return questionText; }
    public void setQuestionText(String questionText) { this.questionText = questionText; }
    public String getQuestionType() { return questionType; }
    public void setQuestionType(String questionType) { this.questionType = questionType; }
    public Integer getMarks() { return marks; }
    public void setMarks(Integer marks) { this.marks = marks; }
    public List<OptionDTO> getOptions() { return options; }
    public void setOptions(List<OptionDTO> options) { this.options = options; }
}
