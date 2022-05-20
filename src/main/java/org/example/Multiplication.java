package org.example;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args){

        public void mTable() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input a number: ");
            int input = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= 10; i++) {
                System.out.println(input + " x " + i + " = " + (input * i));
            }
        }
    }
}
