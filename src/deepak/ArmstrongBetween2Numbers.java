package deepak;

import java.util.Scanner;

public class ArmstrongBetween2Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //To find Armstrong Number between two given number.
        //Below is the code for 3 digits number

        System.out.print("Enter First Interval of 3 digits : ");
        int n1 = in.nextInt();

        System.out.print("Enter Second Interval of 3 digits : ");
        int n2 = in.nextInt();

        int i , num , sum , rem;

        for(i=n1; i<=n2; i++){
            num = i;
            sum = 0;

            while(num>0){
                rem = num%10;
                sum = sum + (int)(Math.pow(rem , 3));
                num = num / 10;
            }
            if(sum == i){
                System.out.println(i + " is Armstrong");
            }
        }
    }
}