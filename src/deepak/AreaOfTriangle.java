package deepak;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Area of triangle = half i.e 1/2  * base * Perpendicular height

        int base , height , area;

        System.out.print("Enter the base : ");
        base = in.nextInt();

        System.out.print("Enter the height : ");
        height = in.nextInt();

        area = base * height / 2;

        System.out.println();
        System.out.println("Area Of Triangle is :  " + area);
    }
}
