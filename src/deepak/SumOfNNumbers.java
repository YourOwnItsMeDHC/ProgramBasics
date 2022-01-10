package deepak;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Sum Of N Numbers

        int n , i , num , sum = 0;

        System.out.print(" Summation of how many numbers do you want : ");
        n = in.nextInt();

        for(i=1; i<=n ; i++){
            System.out.print("Enter the number");
            num = in.nextInt();

            sum += num;
        }
        System.out.println();
        System.out.println("Sum of " + n + " numbers is : " + sum);
    }
}
