package org.example;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("At any time, enter \"0\" to leave");

        while (true) {

            System.out.print("Enter a positive number: ");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0)
                break;
            else if (num > 0)
                System.out.println("Number is " + num);
            else
                System.out.println("What do you not understand about the word \"POSITIVE\"? ");

        }

    }
}
