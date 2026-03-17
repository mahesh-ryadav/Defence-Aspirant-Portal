package com.defence.portal.studymaterials.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;        // NDA, CDS, etc.
    private String description;

    @OneToMany(mappedBy = "category",
            cascade = CascadeType.ALL)
    @JsonIgnore
    private List<StudyMaterial> materials;

    // Constructors
    public Category() {}

    // Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<StudyMaterial> getMaterials() {
        return materials;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMaterials(List<StudyMaterial> materials) {
        this.materials = materials;
    }
}
