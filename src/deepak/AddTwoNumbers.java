package deepak;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Addition Of Two Numbers

        int a , b , sum;

        System.out.print("Enter a : ");
        a = in.nextInt();

        System.out.print("Enter b :");
         b = in.nextInt();

         sum = a + b;

        System.out.println();
        System.out.println("Sum of " + a + " and " + b);
        System.out.println("= " + sum);
   }
}
