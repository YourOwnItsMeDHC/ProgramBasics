package deepak;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Factorial Program
        int num  , i , fact = 1;

        System.out.print("Factorial of which number do you want : ");
        num = in.nextInt();

        //for(i=1; i<=num; i++;     <== We can use these also
        for(i=num; i>=1; i--){
            fact *= i;                    //fact = num * num
        }
        System.out.print("Factorial is : " + fact);
    }
}
