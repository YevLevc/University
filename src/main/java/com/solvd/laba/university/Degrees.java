package com.solvd.laba.university;

import com.solvd.laba.university.enums.Degree;

import java.util.ArrayList;

public class Degrees {
    private int id;
    private Degree degree;
    private int salary;

    private ArrayList <Lectors> lectors;

    public Degrees(int id, Degree degree, int salary, ArrayList<Lectors> lectors) {
        this.id = id;
        this.degree = degree;
        this.salary = salary;
        this.lectors = lectors;
    }

    public Degrees() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<Lectors> getLectors() {
        return lectors;
    }

    public void setLectors(ArrayList<Lectors> lectors) {
        this.lectors = lectors;
    }
}
