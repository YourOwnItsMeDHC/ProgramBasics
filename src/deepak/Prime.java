package deepak;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Check whether the number entered is Prime or not

        System.out.print("Enter the Number : ");
        int num = in.nextInt();

        if(num <= 1){
            System.out.println(num + " is not a Prime Number");
        }
        else{
            int i = 2;

            while(i*i < num){
                if(num % i == 0){
                    System.out.println(num + " is not a Prime Number");
                }
                else{
                    i += 1;
                }
            }

            if(i*i > num){
                System.out.println(num + " is a Prime Number");
            }
            else{
                System.out.println(num + " is not a Prime Number");
            }
        }
    }
}
