package deepak;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        Calculate Compound Interest
        Compound Interest = P(1 + R/100)^T
        Where, P is principle amount , R is the rate and T is the time span
         */

        double principle , rate , time , compInterest;

        System.out.print("Enter the PRINCIPLE : ");
        principle = in.nextDouble();

        System.out.print("Enter the RATE : ");
        rate = in.nextDouble();

        System.out.print("Enter the Time : ");
        time = in.nextDouble();

        compInterest = principle * (Math.pow((1 + rate / 100) , time));

        System.out.println();
        System.out.println("Comppound Interest is : " + compInterest);

    }
}

/*
Example:
Input : Principle (amount): 1200
        Time: 2
        Rate: 5.4
Output : Compound Interest = 1333.099243
 */