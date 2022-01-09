package deepak;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Calculate Commission Percentage
        /*
        Multiply your commission rate by your commission base for the period to calculate your commission payment.
        For example, if you made $30,000 worth of sales from March 1 to March 15 and your commission rate is 5%,
you     your commission payment is $1,500
         */

        double amount , commPer , commision;

        System.out.print("Enter Amount : ");
        amount = in.nextDouble();

        System.out.print("Commision Percentage : ");
        commPer = in.nextDouble();

        commision = amount / 100 * commPer;
//        commision = (commPer / 100) * amount;       // <== We can use these also

        System.out.println();
        System.out.println("Commision is Rs. " + commision);

    }
}
