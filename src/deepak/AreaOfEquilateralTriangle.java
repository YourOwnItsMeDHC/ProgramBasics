package deepak;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* Area Of Equilteral Triangle = √3/4 × (side)2 square units
        side = a = a is same for all three sides
        √3 = 1.73
         */

        double a , area;

        System.out.print("Enter the length of the sides : ");
        a = in.nextDouble();

        area = (a * a) * (Math.sqrt(3)/4);
//        area = (1.73/4) * a * a;                    //another method of calculation

        System.out.println("Area Of Equilateral Triangle is :  " + area);


    }
}
