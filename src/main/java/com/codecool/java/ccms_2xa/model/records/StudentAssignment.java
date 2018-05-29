package com.codecool.java.ccms_2xa.model.records;

public class StudentAssignment {
    
    private Assignment assignment;
    private Integer grade;
    private String link;

    public StudentAssignment(Assignment assigment) {
        this.assignment = assignment;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Assignment getAssignment() {
        return this.assignment;
    }
}
