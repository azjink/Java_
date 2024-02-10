package AOTanditstypes;

import java.util.Scanner;

public class TriangleAreaType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input side lengths of the triangle
        System.out.print("Enter length of side a: ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter length of side b: ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter length of side c: ");
        double sideC = scanner.nextDouble();

        // Calculate area
        double area = calculateArea(sideA, sideB, sideC);

        // Determine type of triangle
        String triangleType = triangleType(sideA, sideB, sideC);

        // Display the results
        System.out.println("Area of the triangle: " + area);
        System.out.println("Type of triangle: " + triangleType);

        scanner.close();
    }

    public static double calculateArea(double a, double b, double c) {
        // Calculate semi-perimeter
        double s = (a + b + c) / 2;

        // Calculate area using Heron's formula
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static String triangleType(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
