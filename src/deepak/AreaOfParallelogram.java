package deepak;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Area of parallelogram = base x height

        int b , h , area;

        System.out.print("Enter the base : ");
        b = in.nextInt();

        System.out.print("Enter the height : ");
        h = in.nextInt();

        area = b * h;

        System.out.print("Area of Parallelogram is :  " + area);
    }

}
