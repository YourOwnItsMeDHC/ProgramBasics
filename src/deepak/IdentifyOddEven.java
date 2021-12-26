package deepak;

import java.util.Scanner;

public class IdentifyOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask for a number
        System.out.print("Enter the number which you want :  ");
        int num = input.nextInt();
        System.out.println("Your number which you have entered is :  " + num);

        //check whether the given number is Even or Odd
        if(num%2==0){
            System.out.println("The given number is Even");
        }
        else{
            System.out.println("The given numbr is Odd");
        }

        System.out.println("Cool , the number" + " " + num + " " +  "which you have entered is identified successfully");
    }

}

