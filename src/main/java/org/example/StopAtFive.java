package org.example;

import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("At any time, enter \"0\" to leave");

        while (true) {

            System.out.println("Guess the Magic Number: ");
            int num = Integer.parseInt(scanner.nextLine());
            if (num == 0)
                break;
            else if (num == 5) {
                System.out.println("You guessed the magic number!");
                break;
            }
            else
                System.out.println("You guessed " + num + ". Guess again.");

        }
    }
}
