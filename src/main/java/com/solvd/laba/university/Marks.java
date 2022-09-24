package com.solvd.laba.university;

import com.solvd.laba.university.enums.Mark;
import com.solvd.laba.university.enums.Specialty;

import java.util.ArrayList;

public class Marks {
    private int id;
    private Gradebook gradebook;
    private Specialty specialty;
    private Mark mark;
    private Lectors lector;

    public Marks(int id, Specialty specialty, Mark mark, Lectors lector) {
        this.id = id;
        this.specialty = specialty;
        this.mark = mark;
        this.lector = lector;
    }

    public Marks(){
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

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public Lectors getLector() {
        return lector;
    }

    public void setLector(Lectors lector) {
        this.lector = lector;
    }

}
