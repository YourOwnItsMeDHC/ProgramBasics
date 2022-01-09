package deepak;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        The power function returns the double type value.

        To Return Integer type Value Using the Power Function
                int i=(int)Math.pow(a,b); //Type Cast to integer
         */

        double a , b , power;

        System.out.print("Enter a : ");
        a = in.nextDouble();

        System.out.print("Enter b : ");
        b = in.nextDouble();

        power = Math.pow(a,b);
//        power = (int)(Math.pow(a,b));  //if want answer in int , above make power as int and uncomment these line

        System.out.println();
        System.out.println("Power of " + a + " raised to " + b + " is :  " + power);
    }
}
