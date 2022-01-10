package deepak;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num , temp , rem , reverse = 0;

        System.out.print("Enter the Number : ");
        num = in.nextInt();
        System.out.println();       //Just for spacing between lines

        temp = num;                 // Because , To compare reversed numbers from original numbers afterward

        while(temp>0){
            rem = temp % 10;

            reverse = reverse * 10 + rem;

            temp /= 10;
        }
        if(num == reverse){
            System.out.println(num + " is Palindrome Number");
        }
        else {
            System.out.println(num + " is not a Palindrome Number");
        }
    }

    /*
    A palindrome is a word, number, phrase,
    or other sequence of characters which reads the same backward as forward, such as madam or racecar.
     */
