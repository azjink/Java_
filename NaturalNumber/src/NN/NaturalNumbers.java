package NN;

import java.util.Scanner;

public class NaturalNumbers {

    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Use a for loop to print numbers from 1 to N
        for(int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        // Close the scanner
        scanner.close();
    }
}
