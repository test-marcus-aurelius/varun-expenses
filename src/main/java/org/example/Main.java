package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello World ");
        // Making the above line a comment since we dont need it in the actual project

        // Asking For User input of Date , Category , Amount and Description
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO EXPENSE TRACKER");

        System.out.println("Enter Date (YYYY-MM-DD):");
        String date = scanner.nextLine();

        System.out.println("Enter Category:");
        String category = scanner.nextLine();

        System.out.println("Enter Amount:");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter Description:");
        String description = scanner.nextLine();

        // HOW TO STORE THIS USER INPUT IN SOMETHING ELSE ? OTHER THAN VARIABLES ?

        // HOW TO STORE IT IN A MAP?

    }
}
