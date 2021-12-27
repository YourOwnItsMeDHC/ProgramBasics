package deepak;

import java.util.Scanner;

public class PrintMsgUptoN {
    public static void main(String[] args) {

        //take value for N
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number upto which you to print Hello World!!! :  ");
        int n = input.nextInt();

        //print the numbers
        for (int num = 1; num <=n ; num += 1) //num++ means num = num + 1 i.e  num += 1
        {
            System.out.println("Hello World !!!");
        }

    }
}
