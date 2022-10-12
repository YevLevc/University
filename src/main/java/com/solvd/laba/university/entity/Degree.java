package com.solvd.laba.university;

import java.util.ArrayList;

public class Degree {
    private int id;
    private com.solvd.laba.university.enums.Degree degree;
    private int salary;

    private ArrayList <Lector> lectors;

    public Degree(int id, com.solvd.laba.university.enums.Degree degree, int salary, ArrayList<Lector> lectors) {
        this.id = id;
        this.degree = degree;
        this.salary = salary;
        this.lectors = lectors;
    }

    public Degree() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.solvd.laba.university.enums.Degree getDegree() {
        return degree;
    }

    public void setDegree(com.solvd.laba.university.enums.Degree degree) {
        this.degree = degree;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<Lector> getLectors() {
        return lectors;
    }

    public void setLectors(ArrayList<Lector> lectors) {
        this.lectors = lectors;
    }

    @Override
    public String toString() {
        return "Degree{" +
                "id=" + id +
                ", degree=" + degree +
                ", salary=" + salary +
                ", lectors=" + lectors +
                '}';
    }
}
