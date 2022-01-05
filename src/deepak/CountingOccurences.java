package deepak;

import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any number : ");
        long number = input.nextLong();

        System.out.print("Enter the number whose occurence you want to know :  ");
        byte identify = input.nextByte();

        int count = 0;

        /*
        If we find remainder (%10) by 10 of any number , we get last digit of that number
        because we have numbers from 0 to 9 only which is not divisible by 10
        Eg : 456754 % 10 gives remainder as 4
        If we get 4 == identify , then make count ++ , otherwise come out of "if" loop

        To remove last digit , divide that same number by 10 , so that last digit will get shift to decimal part
        , system will not consider it , because we haven't take flaot data type .

        Do above two steps again and again until our numbers are greater than 0 .
         */

        while(number > 0){
            long remainder = number % 10;
            if(remainder == identify){
                count++;
            }
            number = number / 10;
        }

        System.out.println("Your number " + identify + " is occured or repeated " + count + " times");

    }
}
