package deepak;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        //Take 2 numbers as input and print the largest number

        Scanner input = new Scanner(System.in);

        //take two numbers
        System.out.println("Enter the FIRST number :  ");
        int num1 = input.nextInt();

        System.out.println("Enter the SECOND number :  ");
        int num2 = input.nextInt();

        //check which number is larger among two
        if(num1>num2){
            System.out.println(num1 + " " + "is greater among the two numbers which you have entered");
        }
        else{
            System.out.println(num2 + " " + "is greater among the two numbers which you have entered");

        }
    }
}
