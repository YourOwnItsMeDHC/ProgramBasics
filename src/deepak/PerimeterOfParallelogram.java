package deepak;

import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Perimeter Of Parallelogram = 2(a+b) , a and b are two diagonals of parellogram

        int a , b , perimeter;

        System.out.print("Enter the FIRST diagonal : ");
        a = in.nextInt();

        System.out.print("Enter the SECOND diagonal : ");
        b = in.nextInt();

        perimeter = 2 * (a + b);

        System.out.println("Perimeter Of Parallelogram is : " + perimeter);


    }
}
