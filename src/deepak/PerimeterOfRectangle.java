package deepak;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Perimeter Of Rectangle = 2(l+w) , l = length and w = width
        int l , w , perimeter;

        System.out.print("Enter the length : ");
        l = in.nextInt();

        System.out.print("Enter the width : ");
        w = in.nextInt();

        perimeter = 2 * (l + w);

        System.out.println("Perimeter Of Rectangle is : " + perimeter);
    }
}
