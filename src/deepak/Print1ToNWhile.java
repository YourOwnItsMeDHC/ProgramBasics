package deepak;

import java.util.Scanner;

public class Print1ToNWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //print 1 to n numbers using while loop

        /*
        syntax of for loop
        for (int num = 1; num <=n ; num += 1) //num++ means num = num + 1 i.e  num += 1
        {
            System.out.println(num);
        }

        syntax of while loop

        initialization
        while(terminating condition){

        "statement whichever you to perform or display"

        increment or decremnt
         */

        System.out.println("Enter the number upto which you want to print :  ");
        int num = input.nextInt();

              int n = 1;
                while(n<=num){
                    System.out.println(n);
                    n++;
                }

    }
}
