// Eddie Hart
// Jan 29th, 2024
// CSC 1060

import java.util.Scanner;

public class Circleguy {
    public static void calculateDiameter(double d) {
        double diameter = d * 2;
        System.out.println("Diameter: " + diameter);
    }
// This method calculates the diameter
    public static void  calculateArea(double a) {
        double area = (a * a) * Math.PI;
        System.out.printf("Area: %.2f\n", area);
    }
// This method calculates the area
    public static void calculateCircumference(double c) {
        double circumference = Math.PI * 2 * c;
        System.out.printf("Circumference: %.2f", circumference);
    }
// This method calculates the circumference
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle's radius: ");
        double radius = input.nextDouble();
        calculateDiameter(radius);
        calculateArea(radius);
        calculateCircumference(radius);
        // here in main i use all the methods i defined to calculate different values
        // from the user's radius input
    }
}