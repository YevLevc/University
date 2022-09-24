package com.solvd.laba.university;

public class StudyInfo {
    private int studentId;
    private String faculty;
    private byte course;

    public StudyInfo(int studentId, String faculty, byte course) {
        this.studentId = studentId;
        this.faculty = faculty;
        this.course = course;
    }

    public StudyInfo(){}

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public byte getCourse() {
        return course;
    }

    public void setCourse(byte course) {
        this.course = course;
    }
}
