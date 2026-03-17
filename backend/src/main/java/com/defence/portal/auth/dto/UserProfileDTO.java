package com.defence.portal.auth.dto;

import java.util.List;

public class UserProfileDTO {
    private String fullName;
    private String email;
    private String username;
    private List<String> roles;
    private long totalTestsAttempted;

    // Constructors
    public UserProfileDTO() {}

    public UserProfileDTO(String fullName, String email, String username, List<String> roles, long totalTestsAttempted) {
        this.fullName = fullName;
        this.email = email;
        this.username = username;
        this.roles = roles;
        this.totalTestsAttempted = totalTestsAttempted;
    }

    // Getters
    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public long getTotalTestsAttempted() {
        return totalTestsAttempted;
    }

    // Setters
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public void setTotalTestsAttempted(long totalTestsAttempted) {
        this.totalTestsAttempted = totalTestsAttempted;
    }
}
