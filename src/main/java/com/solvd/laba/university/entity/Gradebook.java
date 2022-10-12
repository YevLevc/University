package com.solvd.laba.university;

import com.solvd.laba.university.enums.Course;

import java.util.ArrayList;

public class Gradebook {
    private int id;
    private Student student;
    private Faculty faculty;
    private Course course;

    private ArrayList <Mark> marks;

    public Gradebook(int id, Student student, Faculty faculty, Course course, ArrayList<Mark> marks) {
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

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Mark> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Gradebook{" +
                "id=" + id +
                ", student=" + student +
                ", faculty=" + faculty +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }
}
