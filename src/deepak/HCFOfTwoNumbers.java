package deepak;

import java.util.Scanner;

public class HCFOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //HCF Of Two Numbers Program

        int num1 , num2 , min , max , i , remMin , remMax , hcf = 0;

        System.out.print("Enter the FIRST number : ");
        num1 = in.nextInt();

        System.out.print("Enter the SECOND number : ");
        num2 = in.nextInt();

        if(num1<num2){
            min = num1;
            max = num2;
        }
        else{
            min = num2;
            max = num1;
        }

        for(i=1; i<=min; i++){
            remMin = min % i;
            if(remMin == 0){
                remMax = max % i;
                if(remMax == 0){
                    if(i>hcf){
                        hcf = i;
                    }

                }
            }
        }

//        //Method - 2 (No need to find min max also)
//        //To use method - 2 , uncomment 43 to 47 and comment 19 to 39
//        for(i=1; i<=num1 || i<=num2; i++){
//            if(num1%i == 0 && num2%i == 0){
//                hcf = i;
//            }
//        }

        System.out.println("HCF of " + num1 + " and " + num2 + " is : " + hcf);

    }
}

     /*
     Find Minimum among that two numbers.
     Divide number (minimum one) by 1 to itself.
     If remainder is 0 , means that i value is factor of min number.
     Check is that same i value gives remainder as 0 after dividing max number by that i .
     If yes , it means that i value is the factor of both the numbers .
     Assume HCF as 0 initially.
     Check is that i value is greater than HCF , if yes replace HCF by i.
     Do above steps until for loop runs , then after the loop , whatever value HCF stored that will be
     the HCF of that two numbers.
      */