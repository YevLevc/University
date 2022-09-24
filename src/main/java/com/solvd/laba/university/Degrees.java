package com.solvd.laba.university;

public class Salary {
    private String degree;
    private int salary;

    public Salary(String degree, int salary) {
        this.degree = degree;
        this.salary = salary;
    }
    public Salary(){}

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
