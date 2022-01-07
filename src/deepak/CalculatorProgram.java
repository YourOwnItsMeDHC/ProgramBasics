package deepak;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;    //initially answer = o because we haven't performed anything yet

        //while(true) is an infinity loop , it will stop when break condition will satisfy
        //here , break condition = when x or X will be pressed , program will stop running

        while (true) {

            System.out.print("Enter operator which you wanna perform : ");

            //operators is of char data type
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the FIRST number : ");
                int num1 = input.nextInt();

                System.out.print("Enter the SECOND number : ");
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }

                if (op == '-') {
                    ans = num1 - num2;
                }

                if (op == '*') {
                    ans = num1 * num2;
                }

//                if (op == '/') {
//                    if (num2 != 0) {
//                        ans = num1 / num2;
//                    }
//                }
//
                if (op == '/') {
                    if (num2 == 0) {
                        System.out.println("Cannot Divide");
                        System.out.println("Your Previous");
                        /*
                        added extra line "Your Previous" , because even after displaying "Cannot Divide'
                        it is showing answer of recent last operation (D.C)
                         */

                    } else {
                        ans = num1 / num2;
                    }
                }


                    if (op == '%') {
                        ans = num1 % num2;
                    }


                }
                else if (op == 'x' || op == 'X') {
                    break;                        // if op = x or X , loop will stop running
                }
                else {
                    System.out.println("You have entered INVALID OPERATOR");
                    //i.e. entered excluding + , - , * , / , % , x , X
                }

                System.out.println("Answer is :  " + ans);
                /*
                "ans" statement is written under while loop , because loop will run until user presses x or X
                Also , after performing and giving answer of particular operation , one can perform another
                opeartion also until he/she presses x or X
                 */


        }
    }
}