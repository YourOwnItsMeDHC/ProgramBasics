package deepak;

import java.util.Scanner;

public class AreaOfIsosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Area Of Isosceles Triangle = [ b/4√((4*a*a)-(b*b)) ]
        //a = same side of triangle i.e /\
        //b = remaining third side of triangle i.e __

        double a , b ,area;          //double used , because Math.sqrt gives answer in double

        System.out.print("Enter the length of sided :  ");
        a = in.nextInt();

        System.out.print("Enter the length of side2 i.e remaining one side :");
        b = in.nextInt();

        area = (b/4) * Math.sqrt((4*a*a)-(b*b));

        System.out.print("Area Of Isosceles : " + area);

    }
}
