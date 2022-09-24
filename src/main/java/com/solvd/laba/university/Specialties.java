package com.solvd.laba.university;

import com.solvd.laba.university.enums.Specialty;

public class Specialties {
    private int id;
    private Specialty specialty;

    public Specialties(int id, Specialty specialty) {
        this.id = id;
        this.specialty = specialty;
    }

    public Specialties() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
