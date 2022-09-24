package com.solvd.laba.university;

import java.util.ArrayList;

public class LectorsHasSpecialties {
    private ArrayList<Lectors> lectors;
    private ArrayList<Specialties> specialties;

    public LectorsHasSpecialties(ArrayList<Lectors> lectors, ArrayList<Specialties> specialties) {
        this.lectors = lectors;
        this.specialties = specialties;
    }

    public LectorsHasSpecialties(){}

    public ArrayList<Lectors> getLectors() {
        return lectors;
    }

    public void setLectors(ArrayList<Lectors> lectors) {
        this.lectors = lectors;
    }

    public ArrayList<Specialties> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(ArrayList<Specialties> specialties) {
        this.specialties = specialties;
    }
}
