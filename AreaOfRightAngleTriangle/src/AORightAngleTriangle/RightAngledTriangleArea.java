package AORightAngleTriangle;

import java.util.Scanner;

public class RightAngledTriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the lengths of the base and height of the triangle
        System.out.print("Enter the length of the base of the triangle: ");
        double baseLength = scanner.nextDouble();
        
        System.out.print("Enter the length of the height of the triangle: ");
        double heightLength = scanner.nextDouble();

        // Calculate the area
        double area = 0.5 * baseLength * heightLength;

        // Print the result
        System.out.println("The area of the right-angled triangle is: " + area);

        scanner.close();
    }
}
