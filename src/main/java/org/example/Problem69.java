package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Euler's Totient function, φ(n) [sometimes called the phi function]
 * is used to determine the number of numbers less than n which are
 * relatively prime to n. For example, as 1, 2, 4, 5, 7, and 8,
 * are all less than nine and relatively prime to nine, φ(9)=6.
 * It can be seen that n=6 produces a maximum n/φ(n) for n ≤ 10.
 * Find the value of n ≤ 1,000,000 for which n/φ(n) is a maximum.
 */

public class Problem69 {

    static Set<Integer> primeFactorization(int number) {
        Set<Integer> factors = new HashSet<>();
        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }
        int i = 3;
//        while (i <= Math.sqrt(number)) {
        while (i <= Math.sqrt(number)) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
            i += 2;
        }
        if (number > 2) {
            factors.add(number);
        }
        return factors;
    }

    static double phi(int number) {
        double eulerTotient = 1.0;
        Set<Integer> factors = primeFactorization(number);
        for (int factor : factors) {
            eulerTotient *= (1 - (1 / (float) factor));
//            System.out.println(factor + " " + eulerTotient);
        }
        return Math.round(eulerTotient * number);
    }


    public static void main(String[] args) {

        int number = 1_000_000;
        double max = 1;
        int maxIndex = 2;
        for (int i = 2; i <= number; i++) {
            double phi = phi(i); //φ(n)
            var qotient = i / phi; //n/φ(n)
            if (qotient > max) {
                maxIndex = i;
                max = qotient;
            }
            System.out.println("Phi(" + i + ") = " + phi);
        }
        System.out.println(maxIndex);

    }
}