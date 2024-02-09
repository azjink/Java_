package AOTtwoangleisGiven;

import java.util.Scanner;

public class ThirdAngleOfTriangle {
    public static double findThirdAngle(double angle1, double angle2) {
        return 180 - (angle1 + angle2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the measure of the first angle in degrees: ");
        double angle1 = scanner.nextDouble();
        System.out.print("Enter the measure of the second angle in degrees: ");
        double angle2 = scanner.nextDouble();

        double thirdAngle = findThirdAngle(angle1, angle2);

        System.out.println("The measure of the third angle is: " + thirdAngle + " degrees");

        scanner.close();
    }
}
