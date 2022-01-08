package deepak;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Perimeter Of Circle = 2πr

        double r , perimeter;

        System.out.print("Enter the radius : ");
        r = in.nextDouble();

        perimeter = 2 * Math.PI * r;

        System.out.println("Perimeter Of Circle is : " + perimeter);
    }
}
