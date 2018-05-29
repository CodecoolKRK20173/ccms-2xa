package com.codecool.java.ccms_2xa.model.records;

import java.util.List;
import java.util.ArrayList;

public class Student extends User {

    private CodeClass codecoolClass;
    private List<StudentAssignment> studentAssignmentList;

    public Student(String login, String password, String mail, String name) {
        super(login, password, mail, name);
        codecoolClass = new CodeClass("KRK.2017.11");
        studentAssignmentList = new ArrayList<StudentAssignment>();
    }

    public CodeClass getCodecoolClass() {
        return codecoolClass;
    }

    public void setCodecoolClass(CodeClass codecoolClass) {
        this.codecoolClass = codecoolClass;
    }

    public List<StudentAssignment> getStudentAssignmentList() {
        return studentAssignmentList;
    }

    public StudentAssignment getStudentAssignmentById(int assignmentId) {

        for(StudentAssignment studentAssignment : studentAssignmentList) {
            if (studentAssignment.getAssignment().getId() == assignmentId) {
                return studentAssignment;
            }
        }
        return null;       
    }
}
