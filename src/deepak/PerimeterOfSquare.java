package deepak;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Perimeter Of Square = 4a

        int a , perimeter;

        System.out.print("Enter sides of square : ");
        a = in.nextInt();

        perimeter = 4 * a;

        System.out.println("Perimeter Of Square is : " + perimeter);
    }
}
