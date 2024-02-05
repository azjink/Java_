package DCA;

import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("Diameter of the circle: " + diameter);
        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}
