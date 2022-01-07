package deepak;

import java.util.Scanner;

public class IdentifyWeekdaysAndWeekends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day number to know whether it is Weekday or Wekend : ");
        byte day = input.nextByte();

                switch(day) {
            case 1 , 2 ,3 , 4 ,5 -> System.out.println("Weekday");
            case 6 , 7 -> System.out.println("Weekend");
                }

//                //traditional method
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }

    }
}
