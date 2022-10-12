package com.solvd.laba.university;

import java.util.ArrayList;

public class LectorsHasSpecialties {
    private ArrayList<Lector> lectors;
    private ArrayList<Specialty> specialties;

    public LectorsHasSpecialties(ArrayList<Lector> lectors, ArrayList<Specialty> specialties) {
        this.lectors = lectors;
        this.specialties = specialties;
    }

    public LectorsHasSpecialties(){}

    public ArrayList<Lector> getLectors() {
        return lectors;
    }

    public void setLectors(ArrayList<Lector> lectors) {
        this.lectors = lectors;
    }

    public ArrayList<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(ArrayList<Specialty> specialties) {
        this.specialties = specialties;
    }
}
