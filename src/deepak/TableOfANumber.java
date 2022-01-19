package deepak;

import java.util.Scanner;

public class TableOfANumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Table of an entered number

        System.out.print("Enter the Number : ");
        int num = in.nextInt();

        in.close();

        System.out.println("Table of " + num + " is : ");

        int i, table;
        for(i=1; i<=10; i++){
            table = num * i;
            System.out.println(num + " x " + i + " = " + table);
        }
    }
}
