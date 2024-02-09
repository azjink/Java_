package SPAOT;

import java.util.Scanner;

public class TriangleProperties {
    public static double calculateSemiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static double calculateArea(double a, double b, double c) {
        double s = calculateSemiPerimeter(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        double semiPerimeter = calculateSemiPerimeter(a, b, c);
        double area = calculateArea(a, b, c);

        System.out.println("Semi-Perimeter: " + semiPerimeter);
        System.out.println("Area: " + area);

        scanner.close();
    }
}
