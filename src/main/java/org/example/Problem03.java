package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem03 {

    static boolean isPrime(int n) {
        if (n == 2 || n == 3) {
            return true;
        }
        int i;
        double limit = (int) Math.sqrt(n);
        for (i = 2; i < limit; i++) {
            if (n % i == 0) {
                break;
            }
        }
        return limit == i;
    }

    static List<Long> primeFactors(Long n) {
        List<Long> factors = new ArrayList<>();
        int d = 2;
        while (d * d <= n) {
            System.out.println("Execution num #"+d);
            while (n % d == 0) {
                factors.add((long) d);
                n = (long) n / d;
            }
            d++;
        }
        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    static long lastFactor(Long number) {
        long last = 1;
        int factor = 2;
        while (number > 1) {
            System.out.println("Execution num #"+factor);
            if (number % factor == 0) {
                last = factor;
                number = (long) number / factor;
                while (number % factor == 0) {
                    number = (long) number / factor;
                }
            }
            factor++;
        }

        return last;
    }

    public static void main(String[] args) {
        long number = 600851475143L;
        long max = Collections.max(primeFactors(number));
        System.out.println(lastFactor(max));
//        for (long factors:primeFactors(number) ){
//            System.out.print(factors+", ");
//        }
    }
}