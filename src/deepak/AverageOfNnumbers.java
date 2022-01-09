package deepak;

import java.util.Scanner;

public class AverageOfNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Calculate Average Of N Numbers

        int num , count = 0 , sum = 0 , avg;

        System.out.println("If you don't want to press any number , enter 0");

        while(true) {
            System.out.print("Enter Number : ");
            num = in.nextInt();

            if(num == 0) {
                break;
            }
            else {
                sum += num;
                count += 1;
            }
        }

        avg = sum / count;
        System.out.println("Average of " + count + " numbers is " + avg);
    }
}
