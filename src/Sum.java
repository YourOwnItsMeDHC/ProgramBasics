import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number which you want to add :");
        int num1 = input.nextInt();
        System.out.println("Your first number is :   " + num1);

        System.out.print("Enter second number which you want to add : ");
        int num2 = input.nextInt();
        System.out.println("Your second number is :   " + num2);

        int sum = num1 + num2;
        System.out.println("Sum of two number is :" + sum);


    }
}

