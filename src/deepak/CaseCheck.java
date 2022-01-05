package deepak;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Firstly take first letter of provided string
        System.out.println("Enter your alphabet :  ");
             char letter = input.next().trim().charAt(0);

             /*
             .next() = prints only very first string of provided sentence
             trim = it removes extra spaces which are at both start and last ends
             eg :
             String letter = input.next().trim()  but it takes strings and not character

             charAt(0) = print character which are at 0th index
              */

        System.out.println("You haved entered :  " + letter);

        /*
        find whether entered letter is capital or small using ASCII values
        a to z = 97 to 122
        A to Z = 65 to 90
         */

        if(letter >= 97 && letter <= 122){
            System.out.println("Entered letter " + letter + " " + " is SMALL");
        }
        else if(letter >= 65 && letter <= 90){
            System.out.println("Entered letter " + letter + " " + " is CAPITAL");
        }
        else{
            System.out.println("You have entered something different excluding letters , you cheated , you have tried to fool me ");
        }

    }
}
