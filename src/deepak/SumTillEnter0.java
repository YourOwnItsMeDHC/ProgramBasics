package deepak;

import java.util.Scanner;

public class SumTillEnter0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num , ans = 0;
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

        while(true){
            System.out.print("Enter the numbers for summation , and enter 0 to terminate : ");
             num = in.nextInt();

            if(num == 0){
                break;
            }
            else{
                ans += num;
            }
        }
        System.out.println();
        System.out.println("Summation of all numbers which you have entered is : " + ans);
    }
}
