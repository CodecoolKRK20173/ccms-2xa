package com.codecool.java.ccms_2xa;

import com.codecool.java.ccms_2xa.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	User jerzy = new Manager("Jerzy", "1234", "a@i.pl", "JerzyManager");
        User piotr = new Mentor("Piotr", "1234", "p@k.pl", "PiotrMentor");
        System.out.println( "Hello World!" );
    }
}
