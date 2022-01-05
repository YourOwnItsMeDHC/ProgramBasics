package deepak;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0 , num2 = 1 , num3 = 0 , i , count;

        System.out.println("Of which position you want the Fibonacci Number :  ");
        count = input.nextInt();

        /*
        We have started i from 2 , because we already have first two numbers (0 and 1) at index = 0 and 1
        i.e. our base cases
        We didn't and = in count along with < , because i=2 is index value but it is third element
        so , to compensate we wrote i<count
        Eg : if count = 10
        then , i<count will count index 2 to 10 and not element 2nd to 10th element
         */

        //Using for loop
        for(i =2; i<count; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println("Your Fibonacci Number for position  " +  count + " is :  " + num3);


//        //Using while loop
//            i = 2;
//            while(i<count){
//                num3 = num1 + num2;
//                num1 = num2;
//                num2 = num3;
//                i++;
//            }
//        System.out.println("Your Fibonacci Number for position  " +  count + " is :  " + num3);

    }
}

