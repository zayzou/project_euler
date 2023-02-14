package org.example;

import java.math.BigInteger;

/**
 * n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100!
 */

public class Problem20 {

    static int convertToDigit(char c) {
        return Character.getNumericValue(c);
    }

    static BigInteger factorailOf(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 2; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));

        }
        return factorial;
    }


    static long recursiveFactorial(int n) {
        if (n == 1) {
            return 1;
        } else return n * recursiveFactorial(n - 1);
    }

    public static void main(String[] args) {

        String factorial = factorailOf(100).toString();
        long sum = 0;
        for (int i = 0; i < factorial.length(); i++) {
            sum += convertToDigit(factorial.charAt(i));
        }
        System.out.println("SUM: " + sum);


    }
}