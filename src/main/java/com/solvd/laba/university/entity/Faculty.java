package com.solvd.laba.university;

import java.util.ArrayList;

public class Faculty {
    private int id;
    private Faculty faculty;
    private ArrayList<Specialty> specialties;

    public Faculty(int id, Faculty faculty, ArrayList<Specialty> specialties) {
        this.id = id;
        this.faculty = faculty;
        this.specialties = specialties;
    }

    public Faculty() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public ArrayList<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(ArrayList<Specialty> specialties) {
        this.specialties = specialties;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", faculty=" + faculty +
                ", specialties=" + specialties +
                '}';
    }
}
