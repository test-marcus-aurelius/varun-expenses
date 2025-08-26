package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String choice = "y";

        Scanner scanner = new Scanner(System.in);

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Welcome To Expense Tracker");

            System.out.println("Enter Date (YYYY-MM-DD):");
            String date = scanner.nextLine();

            System.out.println("Enter Category (Food, Transport, Utilities,Rent etc.):");
            String category = scanner.nextLine();

            System.out.println("Enter Amount:");
            double amount = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter Description:");
            String description = scanner.nextLine();

            System.out.println("Do you want to add another expense? (y/n)");
            choice = scanner.nextLine();

        }

        System.out.println("Thank you for using Expense Tracker!");

    }

}
