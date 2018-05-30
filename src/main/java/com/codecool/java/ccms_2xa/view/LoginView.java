package com.codecool.java.ccms_2xa.view;

import com.codecool.java.ccms_2xa.model.*;
import java.util.ArrayList;

public class LoginView {

    public boolean isConfirmed;
    public ArrayList<User> studentList;
    public ArrayList<User> managerList;
    public ArrayList<User> mentorList;
    public ArrayList<User> regularList;

    public LoginView() {
        this.isConfirmed = false;
        
    }

    // public boolean confirm(String login, String password) {
        
    // }

}