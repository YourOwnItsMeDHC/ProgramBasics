package deepak;

import java.util.Scanner;

public class CurrencyToDollar {
    public static void main(String[] args) {

        //Input currency in rupees and output in USD

        Scanner input = new Scanner(System.in);

        //ask for the amount which have to get converted
        System.out.println("Enter the amount in Indian Currency i.e Rupees :  ");
        float rupees = input.nextFloat();

        //convert it into USD Dollar
        // 1 USD = 75.39 rupees

        float dollar = rupees / 75.39f;

        //show the converted amount
        System.out.println("The amount you have entered is" + rupees + " " + ", which will be" + " ");
        System.out.println(dollar + " " + "in USD Dollar");

    }
}
