package deepak;

import java.util.Scanner;

public class CharacterToAscii {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any letter which you want to convert into ASCII value :  ");

        char letter = input.next().charAt(0);
//        int ascii = letter ;
        int ascii = (int)(letter);

        System.out.println("The ASCII value of letter which you have entered is :  " + ascii);
    }
}
