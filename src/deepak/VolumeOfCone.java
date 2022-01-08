package deepak;

import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Volume Of Cone = pie x r^2 x h/3

        double r , h , volume;

        System.out.print("Enter the radius : ");
        r = in.nextDouble();

        System.out.print("Enter the height : ");
        h = in.nextDouble();

        volume = Math.PI * r*r * h/3;

        System.out.println("Volume Of Cone is : " + volume);


    }

}