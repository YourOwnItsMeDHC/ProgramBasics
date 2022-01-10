package deepak;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Future Investment Value = FV=PV (1+i)^n
        //future value = present value x (1+ interest rate)^n           , n is number of years

        long presentValue;
        double rate , futureValue;
        byte years;

        System.out.print("Enter the Amount invested in future plans : ");
        presentValue = in.nextLong();

        System.out.print("Enter the Interest Rate of the plan : ");
        rate = in.nextFloat();

        System.out.print("Number of Years : ");
        years = in.nextByte();

        System.out.println();   // line spacing

        futureValue = presentValue * Math.pow((1 + rate/100) , years);

        System.out.println("Future Value of Rs." + presentValue + " after " + years + " years is : Rs." + futureValue);
    }
}

     /*
     Future value is a value of an investment or asset on a specific date in the future.
     To put it another way, the future value
     is the amount of money a given investment will be worth after a certain period,
     assuming a specific rate of return (interest rate)
      */