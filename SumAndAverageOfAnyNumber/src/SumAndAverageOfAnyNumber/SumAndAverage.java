package SumAndAverageOfAnyNumber;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Taking an array of numbers as input
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] numStrings = input.split("\\s");
        double[] numbers = new double[numStrings.length];

        // Convert input strings to double
        for (int i = 0; i < numStrings.length; i++) {
            numbers[i] = Double.parseDouble(numStrings[i]);
        }

        // Call the method to calculate sum and average
        double[] result = calculateSumAndAverage(numbers);

        // Output the results
        System.out.println("Sum: " + result[0]);
        System.out.println("Average: " + result[1]);
    }

    public static double[] calculateSumAndAverage(double[] numbers) {
        double[] result = new double[2];

        // Calculate sum
        double totalSum = 0;
        for (double num : numbers) {
            totalSum += num;
        }

        // Calculate average
        double average = totalSum / numbers.length;

        result[0] = totalSum;
        result[1] = average;

        return result;
    }
}
