package deepak;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Swap of two numbers

        int a , b ,temp;

        System.out.print("Enter value for a : ");
        a = in.nextInt();

        System.out.print("Enter value for b : ");
        b = in.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println();
        System.out.println("a = " + a + " , b = " + b);
    }
}
