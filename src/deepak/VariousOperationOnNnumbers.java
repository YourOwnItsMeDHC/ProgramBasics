package deepak;

import java.util.Scanner;

public class VariousOperationOnNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        Write a program to print the sum of negative numbers , sum of positive even numbers
        and the sum of positive odd numbers from a list of numbers (N) entered by the user.
        The list terminates when the user enters a zero.
         */

        int num , sumOfNegatives = 0 , sumOfEvenPositives = 0 , sumOfOddPositives = 0;

        while(true){
            System.out.print("Enter Number : ");
            num = in.nextInt();

            if(num<0){
                sumOfNegatives += num;
            }
            else if(num == 0){
                break;
            }
            else if(num % 2 == 0){
                sumOfEvenPositives += num;
            }
            else{
                sumOfOddPositives += num;
            }
        }

        System.out.println();
        System.out.println("Sum of Negative Numbers is : " + sumOfNegatives);
        System.out.println("Sum Of Positive Odd Numbers : " + sumOfOddPositives);
        System.out.println("Sum Of Positive Even Numbers : " + sumOfEvenPositives);
    }
}
