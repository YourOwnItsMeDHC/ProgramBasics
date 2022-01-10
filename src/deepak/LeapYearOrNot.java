package deepak;

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Check Leap Year Or Not

        System.out.print("Enter the Year : ");
        int year = in.nextInt();

        boolean leap = false;    //i.e  0  i.e null

        //if the year is divided by 4
        if(year % 4 == 0){

            //if the year is Century
            if(year % 100 == 0){

                //if the year is divided by 400
                //then it is a leap year
                if(year % 400 == 0){
                    leap = true;
                }
                else{
                    leap = false;
                }
            }

            //if the year is not Century
            else{
                leap = true;
            }
        }
        else{
            leap = false;
        }

        if(leap){                                           //if(leap) means if(leap == true)
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
          /*
        To determine whether a year is a leap year, follow these steps:

        1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
        2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
        3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
        4. The year is a leap year (it has 366 days).
        5. The year is not a leap year (it has 365 days).
         */