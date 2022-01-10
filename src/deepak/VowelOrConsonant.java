package deepak;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Check whether the alphabet is  Vowel Or Consonant
        //Below code is only for small case letter

        System.out.print("Enter the letter : ");
        char letter = in.next().trim().charAt(0);

        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' ||letter == 'u'){
            System.out.println(letter + " is Vowel");
        }
        else{
            System.out.println(letter + " is Consonant");
        }
    }
}
