package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("Welcome!");
        System.out.println();

        AuxUser auxUser = new AuxUser();
        System.out.println();
        auxUser.printMenu();
    }
}
