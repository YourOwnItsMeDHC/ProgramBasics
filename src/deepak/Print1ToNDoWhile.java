package deepak;

import java.util.Scanner;

public class Print1ToNDoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*
        do while loop
        SYNTAX :

        initialization
        do{
        "statement which you want to print"
        increment or decrement operation
        }
        while(terminating condition);

         */

        System.out.println("Enter the number upto which you want to print :  ");

        int num = input.nextInt();

        int n = 1;
        do{
            System.out.println(n);
            n++;
        }
        while(n<=num);

//        int n = 1;
//        do{
//            System.out.println("Hello World");
//
//        }while(n!=1);
    }
}
