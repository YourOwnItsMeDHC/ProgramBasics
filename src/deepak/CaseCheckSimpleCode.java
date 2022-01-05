package deepak;

import java.util.Scanner;

public class CaseCheckSimpleCode {
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
//
//        if(letter >= 'a' && letter <= 'z'){
//            System.out.println("Entered letter " + letter + " " + " is SMALL");
//        }
//        else{
//            System.out.println("Entered letter " + letter + " " + " is CAPITAL");
//        }


        if(letter >= 'a' && letter <= 'z'){
            System.out.println("Entered letter " + letter + " " + " is SMALL");
        }
        else if(letter >= 'A' && letter <= 'Z'){
            System.out.println("Entered letter " + letter + " " + " is CAPITAL");
        }
        else{
            System.out.println("You have entered something different excluding letters , you cheated , you have tried to fool me ");

        }
    }
}
