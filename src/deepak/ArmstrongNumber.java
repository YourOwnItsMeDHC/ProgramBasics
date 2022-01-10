package deepak;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Armstrong Number ,  It is also known as pluperfect, or Plus Perfect, or Narcissistic number

        long num , rem , count = 0 , temp , armstrong = 0 , justToDisplay ;

        System.out.print("Enter the Number : ");
        num = in.nextLong();

        temp = justToDisplay = num;


        while(temp>0){
            rem = temp % 10;
            count += 1;
            temp /= 10;
        }

        // whilw (num != 0){
        while(num>0){
            rem = num % 10;
            num /= 10;

            armstrong = (long)(Math.pow(rem , count));
        }

        if(num == armstrong){
            System.out.print(justToDisplay +  " is Armstrong");
        }
        else{
            System.out.print(justToDisplay + " is not a Armsrtrong");
        }
    }
}

        /*
        An armstrong number in a given number base b is a number that is the sum of its own digits
        each raised to the power of the number of digits.

        Consider the 6 -digit number 548834 .Calculate the sum obtained by adding the following terms.
        5^6 + 4^6 + 8^6 + 8^6 + 3^6 + 4^6 = 548834
        We obtain the same number when we add the individual terms. Therefore, it satisfies the property.
         */
