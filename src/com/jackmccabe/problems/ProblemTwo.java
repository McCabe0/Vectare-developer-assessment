package com.jackmccabe.problems;

import java.util.ArrayList;

public class ProblemTwo {

    public long SumOfEvenFibSeq(){
        long sumOfEven = 0;
        for (int i: FibSeq(4000000)) {
            if (i % 2 == 0){
                sumOfEven += i;
            }
        }
        //System.out.println(FibSeq(40));
        //System.out.println("The sum of the even numbers is: ");
        return sumOfEven;
    }

    private ArrayList<Integer> FibSeq(long maxValue){
        int sum, firstNumber = 1, secondNumber = 2;
        ArrayList<Integer> seq = new ArrayList<>();
        seq.add(firstNumber); seq.add(secondNumber);
        for (int i = 0; i < 10000; i++) {
            sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            if (sum > maxValue){
                return seq;
            }
            seq.add(sum);
        }
        return seq;
    }
}
