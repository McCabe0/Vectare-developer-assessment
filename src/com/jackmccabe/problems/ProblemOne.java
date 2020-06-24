package com.jackmccabe.problems;

public class ProblemOne {
    public int sumOfNumbers(int lenght){
        int sum = 0;
        for(int i = 0; i<lenght; i++){
            if ((i % 3) == 0 | (i % 5) == 0)
                sum = sum + i;
        }
        return sum;
    }
}
