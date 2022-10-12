package com.solvd.laba.university;

public class Lector {
    private int id;
    private String name;
    private String surname;
    private int seniority;

    private Degree degree;

    public Lector(int id, String name, String surname, int seniority, Degree degree) {
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

    public Lector() {
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

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Lector{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", seniority=" + seniority +
                ", degree=" + degree +
                '}';
    }
}
