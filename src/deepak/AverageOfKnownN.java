package deepak;

import java.util.Scanner;

public class AverageOfKnownN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Average of N numbers , here , we already know value of N

        int n , count = 0 , num , sum = 0 , avg;

        System.out.print("Average of how many numbers you want : ");
        n = in.nextInt();

        while(count<n){
            System.out.print("Enter number : ");
            num = in.nextInt();

            sum += num;
            count += 1;
        }

        avg = sum / n;
        System.out.println();
        System.out.println("Average of " + n + " numbers is : " + avg);
    }
}
