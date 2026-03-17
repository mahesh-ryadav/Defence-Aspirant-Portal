package com.defence.portal.studymaterials.entity;

import jakarta.persistence.*;

@Entity
public class StudyMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;
    private String originalName;
    private String fileType;
    private String filePath;
    private Long fileSize;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    // Constructors
    public StudyMaterial() {}

    // Getters
    public Long getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public String getOriginalName() {
        return originalName;
    }

    public String getFileType() {
        return fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public Category getCategory() {
        return category;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
