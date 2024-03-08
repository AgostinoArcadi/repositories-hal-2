package com.example.repositorieshal2.entity;

import jakarta.persistence.*;

@Entity
@Table
public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private Integer firstAppearance;

    @Column(nullable = false)
    private String inventor;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(Integer id, String name, Integer firstAppearance, String inventor) {
        this.id = id;
        this.name = name;
        this.firstAppearance = firstAppearance;
        this.inventor = inventor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(Integer firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String getInventor() {
        return inventor;
    }

    public void setInventor(String inventor) {
        this.inventor = inventor;
    }

}
