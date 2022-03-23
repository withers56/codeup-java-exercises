package main;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    public static final String ANSI_GREEN = "\033[1;32m";
    public static final String ANSI_BRIGHT_GREEN = "\033[1;92m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {

        String name = "will";
        int num = 9;
        System.out.print(ANSI_BLACK_BACKGROUND);
        System.out.print(ANSI_GREEN + "test");
        System.out.print(ANSI_RESET);
        System.out.print(ANSI_BLACK_BACKGROUND);
        System.out.print(ANSI_BRIGHT_GREEN + "<(-_-)>");




    }
}
