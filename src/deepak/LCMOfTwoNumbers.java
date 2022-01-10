package deepak;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //LCM Of Two Numbers = (a * b) / HCF

        int num1 , num2 , i , hcf = 0 , lcm;

        System.out.print("Enter the FIRST number : ");
        num1 = in.nextInt();

        System.out.print("Enter the SECOND number : ");
        num2 = in.nextInt();

        //Find HCF
        for(i=1; i<=num1 || i<=num2; i++){
            if(num1%i == 0 && num2%i == 0){
                hcf = i;
            }
        }

        lcm = (num1 * num2) / hcf;

        System.out.println();
        System.out.println("LCM of " + num1 + " and " + num2 + " is : " + lcm);
    }
}

      /*
       Find the GCD of 8 and 10.

       Factors of 8: 1, 2, 4, 8
       Factors of 10: 1, 2, 5, 10
       Common Factors: 1, 2
       Greatest Common Divisor: 2

       (8 * 10) / 2
      = 80 / 2
      = 40

      Hence, the LCM of 8 and 10 is 40.
     */