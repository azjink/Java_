package QE;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        // calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // check if discriminant is positive, zero, or negative
        if (discriminant > 0) {
            // two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // two real and equal roots
            double root = -b / (2 * a);
            System.out.println("Root 1 and Root 2: " + root);
        } else {
            // two complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
