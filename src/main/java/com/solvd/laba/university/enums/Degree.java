package com.solvd.laba.university.enums;

public enum Degree {

    DOCTOR("doctor"), CANDIDATE("candidate"), DOCENT ("docent"), LECTURER("lecturer");

    private String degree;

    Degree(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }
}
