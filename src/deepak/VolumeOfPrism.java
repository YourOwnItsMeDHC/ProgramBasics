package deepak;

import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        //Volume Of Prism = Bh , where B is the base area and h is the height

        double B , h , volume;

        System.out.print("Enter the Area of Base : ");
        B = in.nextDouble();

        System.out.print("Enter the height : ");
        h = in.nextDouble();

        volume = B * h ;

        System.out.println("Volume Of Cone is : " + volume);

    }
}
