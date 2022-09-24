package com.solvd.laba.university;

public class LectorsData {
    private int id;
    private String name;
    private String surname;
    private String degree;

    public LectorsData(int id, String name, String surname, String degree) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.degree = degree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LectorsData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
