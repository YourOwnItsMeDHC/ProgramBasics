package deepak;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FruitSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ask user for a fruit name
        System.out.print("Enter name of the fruit :  ");
        String fruit = input.next();

        /*
        In bracket of switch there will be "expression' i.e "variable name"
        Besides case there will be possible value (whichever you want) of that variable
         */

//        //enhanced switch syntax
//        /*
//        right click on "switch" --> shoew context actions --> replace with enhanced "switch" statement
//         */
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits , also expensive");
//            case "Apple" -> System.out.println("Red in color , make you healthy");
//            case "Grapes" -> System.out.println("Small and grouped fruit");
//            case "Strawberry" -> System.out.println("Sweet , Red , Small fruit");
//            default -> System.out.println("Not in stock , type another fruit name");
//        }

        //traditional switch syntax
        switch(fruit) {
            case "Mango" :
                System.out.println("King of fruits , also expensive");
                break;

            case "Apple" :
                System.out.println("Red in color , make you healthy");
                break;

            case "Grapes" :
                System.out.println("Small and grouped fruit");
                break;

            case "Strawberry" :
                System.out.println("Sweet , Red , Small fruit");
                break;

            default :
                System.out.println("Not in stock , try another fruit name");

        }

    }
}
