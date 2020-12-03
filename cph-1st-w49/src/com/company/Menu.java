package com.company;

import java.util.Scanner;

public class Menu {
    public static void displayMenu() {
        Scanner scan = new Scanner(System.in);
        String[] menu = {"Beregn", "Udskriv", "Hjælp"};

        String leftAlignFormat = "| %-4d | %-34s | %n"; //%-4d=4 digits, %-15s= 15 string charactors
        System.out.format("+------+------------------------------------+%n");
        System.out.format("| Nr   | Valgmuligheder                     |%n");
        System.out.format("+------+------------------------------------+%n");
        for (int i = 0; i < menu.length; i++) {
            System.out.format(leftAlignFormat, i + 1, menu[i]);
        }
        System.out.format("+------+------------------------------------+%n");

        boolean finish = false;

        while (!finish) {
            String choice = scan.nextLine();
            switch (choice) {
                case "1":
                    beregn();
                    break;
                case "2":
                    udskriv();
                    break;
                case "3":
                    hjælp();
                    break;
                default:
                    System.out.println("prøv igen");
                    displayMenu();
                    break;
            }
        }
    }

    private static void hjælp() {
    }

    private static void beregn() {
    }

    private static void udskriv() {

    }


}
