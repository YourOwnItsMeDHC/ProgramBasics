package deepak;

import java.util.Scanner;

public class SubtractOfProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1281. Subtract the Product and Sum of Digits of an Integer

        int n, rem, product = 1, sum = 0, result;

        System.out.print("Enter the number : ");
        n = in.nextInt();

        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            product = product * rem;
            sum = sum + rem;
        }
        result = product - sum;
        System.out.println(result);

    }
}
//        //Leetcode Submitted
//        class Solution
//        {
//            public static int subtractProductAndSum(int n) {
//
//                int rem , product = 1 , sum = 0;
//
//                while(n>0){
//                    rem = n%10;
//                    n = n/10;
//                    product = product * rem;  // product *= rem
//                    sum = sum + rem;          // sum += rem
//                }
//                return product - sum;
//            }
//        }
