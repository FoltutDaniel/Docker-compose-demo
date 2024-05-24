package com.docker_example.demo;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table
public class DemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column
    private String name;

    public DemoEntity() {
    }

    public DemoEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public DemoEntity(String name) {
        this.name = name;
    }
}
