package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Prime number you want to display?");
        int number = input.nextInt();
        int count = 0;
        int n = 0;
        while (count < number) {
            if (n < 2) {
                n++;
                continue;
            } else if (n == 2) {
                System.out.println(n);
                count++;
            } else {
                boolean checkprime = true;
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        checkprime = false;
                        break;
                    }
                }
                if (checkprime) {
                    System.out.println(n);
                    count++;
                }
            }
            n++;
        }


    }
}
