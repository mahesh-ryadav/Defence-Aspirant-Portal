package com.defence.portal.auth.entity;

import jakarta.persistence.*;
 
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;

    // Constructors
    public Role() {}

    public Role(ERole name) {
        this.name = name;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public ERole getName() {
        return name;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(ERole name) {
        this.name = name;
    }
}
