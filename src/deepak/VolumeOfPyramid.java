package deepak;

import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Volume Of Pyramid = (lwh)/3

        float l , w , h , volume;

        System.out.print("Enter the length : ");
        l = in.nextFloat();

        System.out.print("Enter the width : ");
        w = in.nextFloat();

        System.out.print("Enter the height : ");
        h = in.nextFloat();

        volume = (l*w*h) / 3;

        System.out.println("Volume Of Pyramid is : " + volume);



    }
}
