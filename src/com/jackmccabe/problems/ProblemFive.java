package com.jackmccabe.problems;

public class ProblemFive {

        public int findPrimeNumber(int element) {
            int counter = 0;
            int checker = 2;

            while (counter != element) {
                checker++;
                if (isPrime(checker)) {
                    counter++;
                }

            }

            return checker;
        }

        private boolean isPrime(int number) {
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

}
