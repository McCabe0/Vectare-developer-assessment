package com.jackmccabe;

import com.jackmccabe.problems.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        System.out.println(" Problem One: " + new ProblemOne().sumOfNumbers(1000));

        System.out.println(" Problem Two: " + new ProblemTwo().SumOfEvenFibSeq());

        System.out.println(" Problem Three: " + new ProblemThree().PalindromeFinder(3));

        System.out.println(" Problem Four: " + new ProblemFour().CheckIfDivisible(20));

        System.out.println(" Problem Five: " + new ProblemFive().findPrimeNumber(1001));

        System.out.println(" Problem Six: " + new ProblemSix().getRoutes(20));

        System.out.println(" Problem Seven: " + new ProblemSeven().maxValue());



        long endTime = System.currentTimeMillis();

        System.out.println((endTime-startTime)/1000 + " seconds");

    }
}
