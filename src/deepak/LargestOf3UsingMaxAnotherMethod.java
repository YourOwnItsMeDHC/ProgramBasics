package deepak;

import java.util.Scanner;

public class LargestOf3UsingMaxAnotherMethod {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //take inputs
        System.out.print("Enter a : ");
        int a = input.nextInt();

        System.out.print("Enter b : ");
        int b = input.nextInt();

        System.out.print("Enter c : ");
        int c = input.nextInt();

        /*
        Initialize max variable by 0 .
        Check if a or b is greater than max and change value of max accordingly.
        Now we have a max value (among a and b) .
        Check whether c is greater than max or not and change accordingly.
         */

        int max = 0;

        if(a>b){
            max = a;
        }
        else{
            max = b;
        }

        // now we have max among a and b , check it with c .

        if(c>max){
            max = c;
        }

        // print max value
        System.out.print("Your largest value among three is :   "  + max);
    }
}
