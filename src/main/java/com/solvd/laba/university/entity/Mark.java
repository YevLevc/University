package com.solvd.laba.university;

import com.solvd.laba.university.enums.Specialty;

public class Mark {
    private int id;
    private Gradebook gradebook;
    private Specialty specialty;
    private com.solvd.laba.university.enums.Mark mark;
    private Lector lector;

    public Mark(int id, Specialty specialty, com.solvd.laba.university.enums.Mark mark, Lector lector) {
        this.id = id;
        this.specialty = specialty;
        this.mark = mark;
        this.lector = lector;
    }

    public Mark(){
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

    public com.solvd.laba.university.enums.Mark getMark() {
        return mark;
    }

    public void setMark(com.solvd.laba.university.enums.Mark mark) {
        this.mark = mark;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", gradebook=" + gradebook +
                ", specialty=" + specialty +
                ", mark=" + mark +
                ", lector=" + lector +
                '}';
    }
}
