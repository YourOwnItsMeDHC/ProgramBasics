package deepak;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {

        //Take name as input and print a greeting message for that name.
        Scanner takeit = new Scanner(System.in);
        System.out.println("Hey Beautiful , What's your good name ?");

        //store the nmae in String variable
        String name = takeit.nextLine();

        //print greeting message
        System.out.println("Howdie " + " " + name);
        System.out.println("Hope you are doing well.");
        System.out.println("Have a Nice Day" + " " + name);

    }
}
