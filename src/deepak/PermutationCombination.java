package deepak;

import java.util.Scanner;

public class PermutationCombination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Find Find Ncr & Npr

        int n  , r  , perm , comb , i , factN = 1 , factR = 1 , diffOfNR , factDiff = 1;

        System.out.print("Enter the value for n : ");
        n = in.nextInt();

        System.out.print("Enter the value for r : ");
        r = in.nextInt();

        for(i=n; i>=1; i--){
            factN *= i;
        }

        for(i=r; i>=1; i--){
            factR *= i;
        }

        diffOfNR = n - r;

        for(i=diffOfNR; i>=1; i--){
            factDiff *= i;
        }

        perm = factN / factDiff;

        comb = factN / (factR * factDiff);

        System.out.println();
        System.out.println("Permutation of n = " + n + " and r = " + r + " is : " + perm);

        System.out.println();
        System.out.println("Combination of n = " + n + " and r = " + r + " is : " + comb);
    }
}

      /*
      In Maths, nPr and nCr are the probability functions that represent permutations and combinations.
      The formula to find nPr and nCr is:
    Permutation:
      nPr represents the probability of selecting an ordered set of ‘r’ objects from a group of ‘n’ number of objects.
      The order of objects matters in case of permutation.
            nPr = n!/(n-r)!

    Combination:
    nCr represents the selection of objects from a group of objects where order of objects does not matter.
            nCr = n!/[r! (n-r)!]

      Here n! is the product of all positive integers less than and equal to n.

      For example, if n = 5, then n! = 5 x 4 x 3 x 2 x 1
       */