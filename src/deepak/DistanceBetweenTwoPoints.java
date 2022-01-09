package deepak;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Calculate Distance Between Two Points
        //formula: √[(x₂ - x₁)² + (y₂ - y₁)²]

        double x1 , x2 ,y1 , y2 , distance;

        System.out.print("Enter the value for x1 : ");
        x1 = in.nextDouble();

        System.out.print("Enter the value for x2 : ");
        x2 = in.nextDouble();

        System.out.print("Enter the value for y1 : ");
        y1 = in.nextDouble();

        System.out.print("Enter the value for y2 : ");
        y2 = in.nextDouble();

        distance = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));

        System.out.println();
        System.out.println("Distance between two points is : " + distance);
    }
}
