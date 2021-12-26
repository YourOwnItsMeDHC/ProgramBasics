package deepak;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

       //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

        Scanner input = new Scanner(System.in);

        //Simple interest is calculated with the following formula: S.I. = P × R × T
        // P = Principal, R = Rate of Interest in % per annum, and T = Time, as the number of years

        System.out.println("Enter the following details :  ");

        System.out.println("Enter the Principal amount :  ");
        float principal = input.nextFloat();

        System.out.println("Enter the Rate of Interest :  ");
        float rateOfInterest = input.nextFloat();

        System.out.println("Enter the time in Years :  ");
        int time = input.nextInt();

        System.out.println("Your Simple Interest according to the information given is : ");
        System.out.println(principal * rateOfInterest * time);

        System.out.println("Do you want to try it for one more time ? ");
    }

}