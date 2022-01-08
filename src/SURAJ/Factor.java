package SURAJ;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num , i;

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
