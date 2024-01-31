package print_SumAndAverageOf3Number;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the sum and average
        double sum = num1 + num2 + num3;
        double average = sum / 3;

        // Print the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}