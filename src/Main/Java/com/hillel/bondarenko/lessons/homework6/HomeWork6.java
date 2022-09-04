package com.hillel.bondarenko.lessons.homework6;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random()*11);
        Scanner scanner = new Scanner(System.in);
        System.out.println(0);
        if (scanner.hasNextInt()) {
            int answer = scanner.nextInt();
            if (answer == secretNumber)
                System.out.println();
        }

        }
           }
