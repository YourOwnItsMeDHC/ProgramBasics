package deepak;
import java.util.Scanner;

public class LargestOf3UsingMaxOptimized {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Using Math.max method

        //take inputs
        System.out.print("Enter a : ");
        int a = input.nextInt();

        System.out.print("Enter b : ");
        int b = input.nextInt();

        System.out.print("Enter c : ");
        int c = input.nextInt();

        /*
        Use Math.max to find maximum value.
        Firstly find maximum of a and b by using Math.max(a ,b)

        Then , find maximum among c and max value which we got from a and b by using Math.max(c, Math.max(a ,b))
         */

        int max = Math.max(c ,Math.max(a , b));

        //print max value
        System.out.println("Largest among three is :   " +  max);
    }
}
