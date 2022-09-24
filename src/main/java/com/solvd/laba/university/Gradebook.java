package com.solvd.laba.university;

import com.solvd.laba.university.enums.Course;

import java.util.ArrayList;

public class Gradebook {
    private int id;
    private Students student;
    private Faculties faculty;
    private Course course;

    private ArrayList <Marks> marks;

    public Gradebook(int id, Students student, Faculties faculty, Course course, ArrayList<Marks> marks) {
        this.id = id;
        this.student = student;
        this.faculty = faculty;
        this.course = course;
        this.marks = marks;
    }

    public Gradebook() {
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public ArrayList<Marks> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Marks> marks) {
        this.marks = marks;
    }
}
