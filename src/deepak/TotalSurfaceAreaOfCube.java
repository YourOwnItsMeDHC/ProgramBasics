package deepak;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        Surface Area of Cube = 6 (Surface area of one Square)
        Total Surface Area Of Cube = 6( side × side )
        i.e  Total Surface Area Of Cube = 6 * a^2         [  a (side) = length=breadth=height  ]
         */

        int a , surfaceArea;

        System.out.print("Enter the side of cube : ");
        a = in.nextInt();

        surfaceArea = 6 * a*a;

        System.out.println("Total Surface Area Of Cube is  : " + surfaceArea);

    }

}
