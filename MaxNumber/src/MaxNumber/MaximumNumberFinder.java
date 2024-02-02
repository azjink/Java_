package MaxNumber;

import java.util.Scanner;

public class MaximumNumberFinder {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Get three numbers as input from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Find the maximum among the three numbers
        double maximum = Math.max(num1, Math.max(num2, num3));

        // Display the result
        System.out.println("The maximum number is: " + maximum);

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
