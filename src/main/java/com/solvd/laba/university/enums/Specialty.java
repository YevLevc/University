package com.solvd.laba.university.enums;

public enum Specialty {
    MANAGEMENT("Management"), ECONOMICS("Economics"), MARKETING("Marketing"),
    FINANCES("Finances"), INFORMATICS("Informatics"), LOGIC("Logic");

    private String specialty;

    Specialty(String specialty) {
        this.specialty = specialty;
    }
}
