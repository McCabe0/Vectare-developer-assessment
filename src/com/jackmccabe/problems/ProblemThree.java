package com.jackmccabe.problems;

import java.util.ArrayList;

public class ProblemThree {

    public int PalindromeFinder(int numberOfDigits){

        int[] boundaries = NumberOfDigits(numberOfDigits);
        int start = boundaries[0];
        int end = boundaries[1];

        ArrayList<Integer> listOfPalindromes = new ArrayList<>();
        int product;

        while (start != end){

            for (int i = start; i <= end; i++) {
                product = start * i;
                if (isPalindrome(product)){
                    listOfPalindromes.add(product);
                }
            }
            start++;
        }
        return listOfPalindromes.get(listOfPalindromes.size() -1 );
    }

    private boolean isPalindrome(int number){

        String check = String.valueOf(number);
        String checkReverse = String.valueOf
                (new StringBuffer(check).reverse());

        if (check.equals(checkReverse)){
            return true;
        }

        return false;
    }

    private int[] NumberOfDigits(int numberOfDigits){

        String start = "1" + new String
                (new char[numberOfDigits - 1]).replace
                ("\0", "0");
        String end = new String
                (new char[numberOfDigits]).replace
                ("\0", "9");

        int startDigit = Integer.parseInt(start);
        int endDigit = Integer.parseInt(end);

        return new int[]{startDigit,endDigit};
    }
}
