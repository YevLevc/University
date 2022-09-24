package com.solvd.laba.university;

import java.util.ArrayList;

public class Faculties {
    private int id;
    private Faculties faculty;
    private ArrayList<Specialties> specialties;

    public Faculties(int id, Faculties faculty, ArrayList<Specialties> specialties) {
        this.id = id;
        this.faculty = faculty;
        this.specialties = specialties;
    }

    public Faculties() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Faculties getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculties faculty) {
        this.faculty = faculty;
    }

    public ArrayList<Specialties> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(ArrayList<Specialties> specialties) {
        this.specialties = specialties;
    }
}
