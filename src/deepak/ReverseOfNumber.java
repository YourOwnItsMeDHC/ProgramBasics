package deepak;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //take number from user
        System.out.print("Enter any number whose reverse you want :   ");
        long number = input.nextLong();

        //initially take answer for reverse as 0
        long reverseAnswer = 0;

        //run "WHILE" loop until number entered is greater than 0
        while(number>0){
            long remainder = number%10;
          number /= 10;                          // or  number = number / 10;
        reverseAnswer = reverseAnswer * 10 + remainder;
        }

        //print reverse of number
        System.out.print("Reverse of numbere entered is :  " +  reverseAnswer);
        }

    }
