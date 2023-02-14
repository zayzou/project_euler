package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Highly divisible triangular number
 */
public class Problem12 {

    static int calculateT(int n) {
        int val = n * (n + 1) / 2;
        return val;
    }

    static List<Integer> findPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        int d = 2;
        while ((long) d * d <= n) {
            while (n % d == 0) {
                factors.add(d);
                n = n / d;
            }
            d++;
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    static List<Integer> findExponents(List<Integer> factors) {
        List<Integer> map = new ArrayList<>();
        List<Integer> exponent = new ArrayList<>();
        for (int factor : factors) {
            if (!map.contains(factor)) {
                exponent.add(Collections.frequency(factors, factor));
                map.add(factor);
            }
        }
        return exponent;
    }

    static long numberOfDivisors(int i) {
        List<Integer> exponent = findExponents(findPrimeFactors(calculateT(i)));
        long num_divisors = 1L;
        for (int expo : exponent) {
            num_divisors *= expo + 1;
        }
        return num_divisors;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int i = 32;
        long numberOfDivisors = 0;
        while (numberOfDivisors < 500) {
            numberOfDivisors = numberOfDivisors(i);
            i++;

        }
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        System.out.println(numberOfDivisors +" found in "+elapsed);
    }
}