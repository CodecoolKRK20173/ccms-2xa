package com.codecool.java.ccms_2xa.view;
import java.util.Scanner;

public class Input {

    public String getString(String text) {
        System.out.println(text);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }  
    
    public int getInt(String text) {
        System.out.println(text);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    public float getFloat(String text) {
        System.out.println(text);
        Scanner input = new Scanner(System.in);
        return input.nextFloat();
    }
}



