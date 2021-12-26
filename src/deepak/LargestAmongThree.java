package deepak;

import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {

        //Take 3 numbers as input and print the largest number
        Scanner input = new Scanner(System.in);
        int num1 , num2 , num3;

        //take three numbers

        System.out.println("Enter the FIRST number :  ");
        num1 = input.nextInt();

        System.out.println("Enter the SECOND number :  ");
        num2 = input.nextInt();

        System.out.println("Enter the THIRD number :  ");
        num3 = input.nextInt();

        //check which number is larger among GIVEN THREE NUMBERS

        if(num1>num2 && num1>num3){
            System.out.println(num1 + " " + " is greater among all three numbers entered");
        }
        else if(num2>num3){
            System.out.println(num2 + " " + " is greater among all three numbers entered");
        }
        else{
            System.out.println(num3 + " " + " is greater among all three numbers entered");

        }



    }
}
