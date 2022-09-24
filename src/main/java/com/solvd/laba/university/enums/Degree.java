package com.solvd.laba.university;

public enum Degree {

    DOCTOR("doctor"), CANDIDATE("candidate"), DOCENT ("docent"), LECTURER("lecturer");

    private String degree;

    Degree(String candidate) {
    }

    public String getDegree() {
        return degree;
    }
}
