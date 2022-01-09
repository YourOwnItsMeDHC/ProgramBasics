package deepak;

import java.util.Scanner;

public class DepreciationofValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*   Calculate Depreciation of Value
        Depreciation is a financial word, defined as the reduction of the recorded cost of a fixed asset
        in a systematic manner until the value of the asset becomes zero or negligible
         */

        int amount , depreciation ,years , temp , i;

        System.out.print("Enter the Amount : ");
        amount = in.nextInt();

        System.out.print("Enter Depreciation Percentage : ");
        depreciation = in.nextInt();

        System.out.print("Enter number of Years : ");
        years = in.nextInt();

        temp = amount;

        for(i=0; i<years; i++){
            temp = (100 - depreciation) * temp / 100;
        }
        System.out.println("Depreciation of Amount " + amount + " is : " + temp);

    }
}
