package deepak;

import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Volume Of Cylinder = π r^2 h

        double r , h , volume;

        System.out.print("Enter the radius : ");
        r = in.nextDouble();

        System.out.print("Enter the height : ");
        h = in.nextDouble();

        volume = Math.PI * r*r * h;

        System.out.println("Volume Of Cylinder is :" + volume);

    }
}
