// Eddie Hart
// Jan 29th, 2024
// CSC 1060

import java.util.Scanner;

public class Circleguy {
    public static double calculateDiameter(double d) {
        return d * 2;
    }
    // This method calculates the diameter
    public static double calculateArea(double a) {
        return (a * a) * Math.PI;
    }
    // This method calculates the area
    public static double calculateCircumference(double c) {
        return Math.PI * 2 * c;
    }
    // This method calculates the circumference
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle's radius: ");
        double radius = input.nextDouble();
        double diameter = calculateDiameter(radius);
        double area = calculateArea(radius);
        double circumference = calculateCircumference(radius);
        System.out.printf("Diameter: %.2f \n", diameter);
        System.out.printf("Area: %.2f \n", area);
        System.out.printf("Circumference: %.2f", circumference);
        // here in main i use all the methods i defined to calculate different values
        // from the user's radius input
        // i also made sure these are now return methods instead of void methods
    }
}
