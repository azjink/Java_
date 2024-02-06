package AOT;

import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first base: ");
        double base1 = scanner.nextDouble();

        System.out.print("Enter the length of the second base: ");
        double base2 = scanner.nextDouble();

        System.out.print("Enter the height of the trapezoid: ");
        double height = scanner.nextDouble();

        double area = trapezoidArea(base1, base2, height);
        System.out.println("The area of the trapezoid is: " + area);

        scanner.close();
    }

    public static double trapezoidArea(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }
}
