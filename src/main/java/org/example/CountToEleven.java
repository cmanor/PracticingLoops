package org.example;

import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number less than 11");
        int input = Integer.parseInt(scanner.nextLine());
        for ( int i = input ; i <= 11; i++) {
            System.out.println(i);
        }
    }
}
