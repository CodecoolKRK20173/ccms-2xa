package com.codecool.java.ccms_2xa.model;

import java.util.List;
import java.util.ArrayList;

public class Student extends User {

    private CodeClass codecoolClass;
    private List<StudentAssigment> studentAssigmentList;

    public Student(String login, String password, String mail, String name) {
        super(login, password, mail, name);
        codecoolClass = new CodeClass("KRK.2017.11");
        studentAssigmentList = new ArrayList<StudentAssigment>();
    }

    public CodeClass getCodecoolClass() {
        return codecoolClass;
    }

    public List<StudentAssigment> getStudentAssigmentList() {
        return studentAssigmentList;
    }

    public void setCodecoolClass(CodeClass codecoolClass) {
        this.codecoolClass = codecoolClass;
    }

    public void setStudentAssigmentList(ArrayList<StudentAssigment> studentAssigmentList) {
        this.studentAssigmentList = studentAssigmentList;
    }

}
