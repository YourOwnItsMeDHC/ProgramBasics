package deepak;

import java.util.Scanner;

public class TakeIntInputPrintLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num , max = 0;
        //Take integer inputs till the user enters 0 and print the largest number from all.

        while(true){
            System.out.print("Enter the number : ");
            num = in.nextInt();

            if(num == 0){
                break;
            }
            else if(num>max){
                max = num;
            }
        }
        System.out.println("Largest number is : " + max);
    }
}
