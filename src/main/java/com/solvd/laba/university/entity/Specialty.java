package com.solvd.laba.university;

public class Specialty {
    private int id;
    private com.solvd.laba.university.enums.Specialty specialty;

    public Specialty(int id, com.solvd.laba.university.enums.Specialty specialty) {
        this.id = id;
        this.specialty = specialty;
    }

    public Specialty() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public com.solvd.laba.university.enums.Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(com.solvd.laba.university.enums.Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", specialty=" + specialty +
                '}';
    }
}
