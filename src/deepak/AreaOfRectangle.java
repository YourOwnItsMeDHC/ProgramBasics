package deepak;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Area of rectangle = w * L  (w = width , l = length)
        int w , l , area ;

        System.out.print("Enter the width : ");
        w = in.nextInt();

        System.out.print("Enter the length : ");
        l = in.nextInt();

        area = w * l;
        System.out.println();
        System.out.print("Area Of Rectangle is :  " + area);

    }
}
