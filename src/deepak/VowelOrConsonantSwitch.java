package deepak;

import java.util.Scanner;

public class VowelOrConsonantSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Check whether the alphabet is  Vowel Or Consonant using SWITCH case

        System.out.print("Enter the letter : ");
        char letter = in.next().trim().charAt(0);

        switch(letter){
            case 'a' , 'e' , 'i' , 'o' , 'u' -> System.out.println(letter + " is Vowel");
            default -> System.out.println(letter + " is Consonant");
        }

//        //old style switch case
//        switch (letter) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println(letter + " is Vowel");
//                break;
//            default:
//                System.out.println(letter + " is Consonant");
//                break;
        }
    }
}
