package deepak;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* Area Of Rhombus = (product of the lengths of the diagonals)/2
        In rhombus , there is 2 diagonals , let that be a and b.
        Also , the length of the DIAGONALS SHOULD BE POSITIVE POSITIVE
         */

        int d1 , d2 ,area;

        System.out.print("Enter the length of FIRST diagonal : ");
        d1 = in.nextInt();

        System.out.print("Enter the length of SECOND diagonal : ");
        d2 = in.nextInt();

        if(d1>=0 && d2>=0){
            area = d1 * d2;
            System.out.print("Area Of Rhombus is : " + area);
        }
        else{
            System.out.println("Invalid Input , Please enter positive values for Diagonals");
        }

    }
}
