package com.codecool.java.ccms_2xa.model;

public class StudentAssigment {
    
    private Assigment assigment;
    private int grade;
    private String link;

    public StudentAssigment(Assigment assigment, int grade, String link) {
        this.assigment = assigment;
        this.grade = grade;
        this.link = link;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
