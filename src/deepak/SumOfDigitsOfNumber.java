package deepak;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Sum Of A Digits Of Numbe

        System.out.print("Enter the Number : ");
        int num = in.nextInt();

        int rem , sum = 0;

        while(num>0){
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of digits is : " + sum);
    }
}
