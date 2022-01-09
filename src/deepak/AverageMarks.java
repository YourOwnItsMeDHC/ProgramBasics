package deepak;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Calculate Average Marks

        int n , i  , marks , sum = 0 , avg;

        System.out.print("Number of Subjects : ");
        n = in.nextInt();

        for(i=1; i<=n; i++){
            System.out.print("Enter Marks for Subject No. " + i +  " : " );
            marks = in.nextInt();

            sum += marks;
        }
        avg = sum / n;
        System.out.println();
        System.out.println("Average of " + n + " subject marks is : " + avg);
    }
}
