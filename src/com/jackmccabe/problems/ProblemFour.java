package com.jackmccabe.problems;

public class ProblemFour {
    public long CheckIfDivisible(int range){
        boolean isDivisibleByAll = true;
        long divisibleNumber = range;
        while (1==1) {
            for (int i = 1; i <= range; i++) {
                isDivisibleByAll = true;
                if (divisibleNumber % i != 0 ) {
                    isDivisibleByAll = false;
                    break;
                }
            }
            if ( isDivisibleByAll ) {
                break;
            }
            divisibleNumber++;
        }
        return divisibleNumber;
    }
}
