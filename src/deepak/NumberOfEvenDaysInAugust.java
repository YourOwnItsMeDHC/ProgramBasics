package deepak;

import java.util.Scanner;

public class NumberOfEvenDaysInAugust {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*Deepak is allowed to go out with his friends only on the even days of a given month.
        Write a program to count the number of days he can go out in the month of August.

        February has 14 even day and rest of the month has 15 even days ,
        without using loop also we can directly print the answer
         */
        System.out.print("Enter the Month : ");
        String month = in.next();

        switch(month){
            case "January" , "March" , "May" , "July" , "August" , "October" , "December" -> System.out.println(month + " has 15 even days");

            case "February" -> System.out.print(month + " has 14 even days");

            case "April" , "June" , "September" , "November" -> System.out.print(month + " has 15 even days");
        }


//        //Can be use below one also (but there is no need of loop)
//        int i , count = 0;
//
//        switch(month){
//            case "January" , "March" , "May" , "July" , "August" , "October" , "December" :
//                for(i=1; i<=31; i++){
//                    if(i%2 == 0){
//                        count += 1;
//                    }
//                }
//                System.out.println("Number of days Deepak can go out is : " + count);
//                break;
//
//            case "February" :
//                for(i=1; i<=28 || i<=29; i++){
//                    if(i%2 == 0){
//                        count += 1;
//                    }
//                }
//                System.out.println("Number of days Deepak can go out is : " + count);
//                break;
//
//            case "April" , "June" , "September" , "November" :
//                for(i=1; i<=30; i++){
//                    if(i%2 == 0){
//                        count += 1;
//                    }
//                }
//                System.out.println("Number of days Deepak can go out is : " + count);
//                break;
//        }

    }
}
