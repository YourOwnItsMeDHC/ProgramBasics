package deepak;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Perimeter of Equilateral Triangle :  3a

        int a , perimeter;
        System.out.print("Enter the sides of Equilateral Triangle : ");
        a = in.nextInt();

        perimeter = 3 * a;

        System.out.println("Perimeter of Equilateral Triangle is : " + perimeter);
    }

}
