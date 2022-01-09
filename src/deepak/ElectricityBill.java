package deepak;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Calculate Electricity Bill
        //Explanation of calculation = https://javatutoring.com/calculate-electricity-bill-java-program/

        double watt , wattUsed , inkWh , unitValue , bill;

        System.out.print("Cost Per Unit : ");
        unitValue = in.nextDouble();

        System.out.print("Watts used per hour : ");
        watt = in.nextDouble();

        /*
        1 unit = 1 kWh
        Watts used per month = watts used per hour * 24 hours * 30 days
        So , In kWh = watts used per month / 1000 = 1 unit
        Then , value of 1 unit * value of KWh per month
         */

        wattUsed = watt * 24 * 30;   //watts used in whole month
        inkWh = wattUsed / 1000;     // watts in kilo terms
        bill = unitValue * inkWh;

        System.out.println("Your Electricity Bill is : " + bill);
    }
}
