package deepak;

import java.util.Scanner;

public class LargestOf3UsingMax {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // take inputs

        System.out.print("Enter a : ");
        int a = input.nextInt();

        System.out.print("Enter b : ");
        int b = input.nextInt();

        System.out.print("Enter c : ");
        int c = input.nextInt();

        int max = a;

        if(b>max){
            max = b;
        }
        if(c>max);{
            max = c;
        }

        System.out.println("the largest number among 3 among 3 is : ");
        System.out.println(max);
    }
}
