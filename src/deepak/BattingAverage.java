package deepak;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Calculate Batting Average

        int matches , runs , notOut , dismiss , avg = 0;

        while(true) {
            System.out.print("Number of MATCHES played : ");
            matches = in.nextInt();

            System.out.print("No of RUNS secured : ");
            runs = in.nextInt();

            System.out.print("Number of times player were NOT OUT : ");
            notOut = in.nextInt();

            dismiss = matches - notOut;

            if (dismiss == 0) {
                System.out.println();
                System.out.println("NA i.e no average can be defined , because batsman was never dissmissed");
                break;
            }
            else {
                avg = runs / dismiss;
                System.out.println();
                System.out.println("Batting Average is : " + avg);
                break;
            }
        }
    }
}
        /*
        Batting Average =Runs Scored / Number of dismissals
        where ,
        Number of dismissals = Number of innings or matches - Number of innings he remained Not Out
        Note: If the batsman was never dismissed, print “NA” as the no average can be defined.

      Input: runs = 10000, matches = 250, not-out = 50
      Output: 50
        Explanation:
        Number of times batsman was dismissed = 250 – 50 = 200
        Batting Average = 10000 / 200 = 50.

     Input: runs = 100, matches = 1, not-out = 1
     Output: NA
         */

