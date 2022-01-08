package deepak;

import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Perimeter Of Rhombus = 4a (It is same as Perimeter Of Square)

        int a , perimeter;

        System.out.print("Enter sides of Rhombus : ");
        a = in.nextInt();

        perimeter = 4 * a;

        System.out.println("Perimeter Of Rhombus is : " + perimeter);

    }
}
