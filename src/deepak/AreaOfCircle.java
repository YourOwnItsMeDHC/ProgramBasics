package deepak;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        double area , pi = 3.14;
//
//        System.out.print("Enter the radius :  ");
//        int r = in.nextInt();
//
//        area = pi * r * r;
//
//        System.out.println();                             //for spacing between lines
//        System.out.print("Area of circle is : " + area);

        /* We can solve the same problem using "Math.PI" from "Math" method .
        (as there is inbuilt value of pi in Math method i.e function) .
        Math.PI gives the accurate value of pi .
         */
        double area;

        System.out.print("Enter the radius :  ");
        int r = in.nextInt();

        area = Math.PI * r * r;

        System.out.print("Area of circle is : " + area);

    }
}
