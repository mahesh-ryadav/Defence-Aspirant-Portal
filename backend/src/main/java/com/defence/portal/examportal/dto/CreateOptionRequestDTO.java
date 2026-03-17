package com.defence.portal.examportal.dto;

public class CreateOptionRequestDTO {
    private String optionKey;
    private String optionText;

    // Constructors
    public CreateOptionRequestDTO() {}

    // Getters
    public String getOptionKey() {
        return optionKey;
    }

    public String getOptionText() {
        return optionText;
    }

    // Setters
    public void setOptionKey(String optionKey) {
        this.optionKey = optionKey;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }
}
