package deepak;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Calculate Discount Of Product

        double price , discount , dicountedPrice , afterDiscount;

        System.out.print("Price of product : ");
        price = in.nextDouble();

        System.out.print("Percentage of Discount : ");
        discount = in.nextDouble();

        dicountedPrice = price / 100 * discount;
        afterDiscount = price - dicountedPrice;

        System.out.println();
        System.out.println("You got benefit or discount of Rs. " + dicountedPrice);
        System.out.println("After discount , the price is Rs. " + afterDiscount);
    }
}
