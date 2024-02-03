package LargestFiveNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input five numbers
        System.out.print("Enter number 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter number 3: ");
        double num3 = scanner.nextDouble();
        System.out.print("Enter number 4: ");
        double num4 = scanner.nextDouble();
        System.out.print("Enter number 5: ");
        double num5 = scanner.nextDouble();

        // Find the largest number
        double largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }
        if (num5 > largest) {
            largest = num5;
        }

        System.out.println("The largest number is: " + largest);
    }
}
