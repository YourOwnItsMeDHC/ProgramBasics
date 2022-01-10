package deepak;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Reverse A String

        System.out.print("Enter the String : ");
        String word = in.next().trim();

        System.out.println(

        );
        int length = word.length();

        String reverse = "" ;               // NULL , same as like we do in numbers , we initialize with 0 .
        int i;

        for(i=length-1; i>=0; i--){
            reverse += word.charAt(i);
        }
        System.out.println("Reverse of String is : " + reverse);

//        //Method - 2
//        System.out.print("Reverse of String is : ");
//        for(i=length-1; i>=0; i--){
//            System.out.print(word.charAt(i));
//        }
    }
}
