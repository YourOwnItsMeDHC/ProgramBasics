package deepak;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Volume Of Sphere = (4/3) * pie * r^3

        double r , volume;

        System.out.print("Enter the Radius : ");
        r = in.nextDouble();

        volume = (4 * Math.PI * r*r*r) / 3;

        System.out.println("Volume Of Sphere is : " + volume);

    }
}
