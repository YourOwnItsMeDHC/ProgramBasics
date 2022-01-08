package deepak;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        Curved Surface Area Of Cylinder = 2πrh

        The radius 'r' of a cylinder is the radius of its base.
        Now, the area of the rectangle = length × breadth.
        2πr is the circumference of the circle and h is the height.
        Area of the curved surface will be = 2πr × h = 2πrh.
         */

        double r , h , area;

        System.out.print("Enter the Radius : ");
        r = in.nextDouble();

        System.out.print("Enter the Height : ");
        h = in.nextDouble();

        area = 2 * Math.PI * r * h;

        System.out.println("Curved Surface Area Of Cylinder is : " + area);

    }
}
