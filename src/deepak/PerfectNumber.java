package deepak;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Perfect Number , a positive integer that is equal to the sum of its proper divisors.
        //The first 5 perfect numbers are 6, 28, 496, 8128, and 33550336.

        System.out.print("Enter the number : ");
        long num = in.nextLong();

        long temp = num;

        long i , rem , sumOfFactors = 0;

        for(i=1; i<temp; i++){
            rem = temp % i;
            if(rem == 0){
               sumOfFactors += i;
            }
        }

        if(sumOfFactors == num){
            System.out.println(num + " is a Perfect Number");
        }
        else{
            System.out.println(num + " is not a Perfect Number");
        }
    }
}

    /*
    A number whose sum of factors (excluding the number itself) is equal to the number is called a perfect number.
    In other words, if the sum of positive divisors (excluding the number itself) of a number equals
    the number itself is called a perfect number.

    Let's take the number 496 and heck it is a perfect number or not.

    First, we find the factors of 496 i.e. 1, 2, 4, 8, 16, 31, 62, 124, and 248.
    Let's find the sum of factors (1 + 2 + 4 + 8 + 16 + 31 + 62 + 124 +248 = 496).
    We observe that the sum of factors is equal to the number itself.
    Hence, the number 496 is a perfect number. Similarly, we can check other numbers also.
     */