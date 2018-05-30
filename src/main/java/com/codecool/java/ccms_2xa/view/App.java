package com.codecool.java.ccms_2xa.view;

import com.codecool.java.ccms_2xa.model.*;

public class App 
{
    public static void main( String[] args ) {

    final String[] mainMenu = new String[] { "Exit", 
                                            "Log in as Manager", 
                                            "Log in as Mentor",
                                            "Log in as Regular",
                                            "Log in as Student",                              
                                            };

    final String[] managerMenu = new String[] { "Exit CcMS", 
                                            "List mentors", 
                                            "List students",
                                            "Add mentor",
                                            "Remove mentor", 
                                            "Edit mentor"                             
                                            };

    final String[] studentMenu = new String[] { "Exit", 
                                            "View my grades", 
                                            "Submit assigment",                            
                                            };

    final String[] mentorMenu = new String[] { "Exit", 
                                        "Add student",
                                        "Remove student",
                                        "Edit student",
                                        "Check attendance",
                                        "Add assigment", 
                                        "Remove assigment",
                                        "Edit assigment",
                                        "Add assigment to Students", 
                                        "Remove assigment from Student",
                                        "Grade Student assigment",
                                        };

    View view = new View();
    view.displayMenus(mainMenu);
    // User jerzy = new Manager("Jerzy", "1234", "a@i.pl", "JerzyManager");
    // User piotr = new Mentor("Piotr", "1234", "p@k.pl", "PiotrMentor");
    // System.out.println( "Hello World!" );

    
    
    }

}
