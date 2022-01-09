package deepak;

import java.util.Scanner;

public class ElectricityBillWithSituation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*GFG
        1 to 100 units – Rs. 10/unit
        100 to 200 units – Rs. 15/unit
        200 to 300 units – Rs. 20/unit
        above 300 units – Rs. 25/unit

      Input: U = 250
      Output: 3500
        Explanation:
        Charge for the first 100 units – 10*100 = 1000
        Charge for the 100 to 200 units – 15*100 = 1500
        Charge for the 200 to 250 units – 20*50 = 1000
        Total Electricity Bill = 1000 + 1500 + 1000 = 3500
      Input: U = 95
      Output: 950
        Explanation:
        Charge for the first 100 units – 10*95 = 950
        Total Electricity Bill = 950
         */

        double units , bill;

        System.out.print("Enter units used looking at your Bill : ");
        units = in.nextDouble();

        if(units<=100){
            bill = units * 10;
        }
        else if(units<=200){
          bill = (100*10) + (units - 100) * 15;
        }
        else if(units<=300){
            bill = (100*10) + (100*15) + (units-200) * 20;
        }
        else {
            bill = (100*10) + (100*15) + (100*20) + (units-300) * 25;
        }

        System.out.println("Bill is : " + bill);
    }
}
