package com.codecool.java.ccms_2xa.model.editors;

import com.codecool.java.ccms_2xa.model.records.*;

public class StudentsEditor extends UsersEditor {

    public void addStudentAssignment(String login, Assignment assignment) {
        Student student = (Student) getUserByLogin(login);
        student.getStudentAssignmentList().add(new StudentAssignment(assignment));
    }

    public void gradeStudentAssignment(String login, int assignmentId, Integer grade) {
        Student student = (Student) getUserByLogin(login);
        student.getStudentAssignmentById(assignmentId).setGrade(grade);
    }

    public void submitStudentAssignment(String login, int assignmentId, String link) {
        Student student = (Student) getUserByLogin(login);
        student.getStudentAssignmentById(assignmentId).setLink(link);
    }
}

