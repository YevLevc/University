package com.solvd.laba.university;

public class Lectors {
    private int id;
    private String name;
    private String surname;
    private int seniority;

    private Degrees degree;

    public Lectors(int id, String name, String surname, int seniority, Degrees degree) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.seniority = seniority;
        this.degree = degree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lectors() {
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

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public Degrees getDegree() {
        return degree;
    }

    public void setDegree(Degrees degree) {
        this.degree = degree;
    }
}
