package deepak;

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Calculate CGPA
        int subjects, i;
        double grade, sum = 0, cgpa, cgpaPercentage;

        System.out.print("Number of Subjects : ");
        subjects = in.nextInt();

        for (i = 1; i <= subjects; i++) {
            System.out.print("Enter Grade (out of 10) in Subject No. " + i + " : ");
            grade = in.nextFloat();
                sum += grade;
        }

        cgpa = sum / subjects;

        System.out.println();
        System.out.println("CGPA of " + subjects + " subjects is : " + cgpa);

        cgpaPercentage = (float) (9.5 * cgpa);

        System.out.print("CGPA percentage of " + subjects + " subjects is : " + cgpaPercentage + " %");
    }
}

      /*
      CGPA ( Cumulative Grade Point Average ) is the systematic arrangement in the educational stream to
      get average of grade points. And the CGPA percentage is 9.5 times the CGPA.

      CGPA = (Grades in all Subjects) / (Total Number of Subjects).

      So, CGPA= 9.5 × CGPA
       */