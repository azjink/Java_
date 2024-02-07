package SemiPerimeterAOT;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sides of the triangle
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        // Calculate semi-perimeter and area
        double semiPerimeter = calculateSemiPerimeter(a, b, c);
        double area = calculateArea(a, b, c, semiPerimeter);

        // Output the results
        System.out.println("Semi-Perimeter: " + semiPerimeter);
        System.out.println("Area: " + area);

        scanner.close();
    }

    public static double calculateSemiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static double calculateArea(double a, double b, double c, double semiPerimeter) {
        double s = semiPerimeter;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
