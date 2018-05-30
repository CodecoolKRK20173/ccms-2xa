package com.codecool.java.ccms_2xa.view;
import java.util.Scanner;

public class View {    

    public void displayMenus(String[] menu) {
        for (int i = 0; i < menu.length; i++) {
            System.out.format("[%d] -> %s\n", i, menu[i]);
        }
    }

    public void handleMainMenu(int option) {
        switch (option) {
            case 1:
                System.out.println("1");
                // handleManager(menagerList);
                break;
            case 2:
                System.out.println("2");
                // handleMentor(mentorList);
                break;
            case 3:
                System.out.println("3");
                // handleRegular(regularList);
                break;
            case 4:
                System.out.println("4");
                // handleStudent(studentList);
                break;
            default:
                System.out.println("There is no such option");
                break;
        }
    }

}