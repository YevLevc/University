package com.solvd.laba.university;

public class Contracts {
    private int id;
    public Students studentId;
    private String admissionDate;
    private String graduationDate;

    public Contracts(int id, Students studentId, String admissionDate, String graduationDate) {
        this.id = id;
        this.studentId = studentId;
        this.admissionDate = admissionDate;
        this.graduationDate = graduationDate;
    }
    public Contracts(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Students getStudentId() {
        return studentId;
    }

    public void setStudentId(Students studentId) {
        this.studentId = studentId;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }
}
