package com.solvd.laba.university;

public class Contract {
    private int id;
    public Student studentId;
    private String admissionDate;
    private String graduationDate;

    public Contract(int id, Student studentId, String admissionDate, String graduationDate) {
        this.id = id;
        this.studentId = studentId;
        this.admissionDate = admissionDate;
        this.graduationDate = graduationDate;
    }
    public Contract(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
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

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", admissionDate='" + admissionDate + '\'' +
                ", graduationDate='" + graduationDate + '\'' +
                '}';
    }
}
