package deepak;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, i;
        //Input a number and print all the factors of that number (use loops).

        System.out.print("Enter the number :  ");
        num = in.nextInt();

//        for(i=1; i<=num; i++){
//            if(num % i == 0){
//                System.out.print(i + " , ");
//            }
//        }

        // if we want full stop at last , then use below code , or otherwise use above code which is commented
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (i == num) {
                    System.out.println(i + " . ");
                    continue;
                }
                System.out.print(i + " , ");

            }
        }
    }
}
