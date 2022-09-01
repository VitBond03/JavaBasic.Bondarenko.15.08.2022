package com.hillel.bondarenko.lessons.homework5;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter team1 name");
        String str = scanner.nextLine();
        System.out.println("You entered" + str);
        int intVariable = -1;
        System.out.println("Please enter frags for player1");
        if (scanner.hasNextInt()) {
            intVariable = scanner.nextInt();
            System.out.println("You entered number: " + intVariable);
        } else {
            System.out.println("WRONG DATA,RESTART!");

        }
    }
}

