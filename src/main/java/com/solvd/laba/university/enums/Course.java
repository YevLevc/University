package com.solvd.laba.university.enums;

public enum Course {
    FIRST (1), SECOND (2), THIRD (3), FOURTH (4);
    private int course;

    Course(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }
}
