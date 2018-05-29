package com.codecool.java.ccms_2xa.model;

import com.codecool.java.ccms_2xa.model.editors.*;
import com.codecool.java.ccms_2xa.model.records.*;

public class Main{
    public static void main (String args[]) {
        //User admin = new User("Admin", "1234", "a@i.pl", "Ania");
        User jerzy = new Manager("Jerzy", "1234", "a@i.pl", "JerzyManager");
        User piotr = new Mentor("Piotr", "1234", "p@k.pl", "PiotrMentor");
    }

}
