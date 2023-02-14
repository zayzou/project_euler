package org.example;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class Problem10 {
    public static void bellow2Millons() {
        int limit = 2_000_000;
        int counter = 0;
        long sum = 0;
        boolean[] sieve = new boolean[limit];
        for (int i = 2; i < Math.sqrt(limit); i++) {
            if (sieve[i] == false) {
                for (int j = i * 2; j < limit; j++) {
                    if (j % i == 0) {
                        sieve[j] = true;
                    }
                }
            }
        }

        for (int i = 2; i < limit; i++) {
            if (sieve[i] == false) {
                counter++;
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Number of primes found : " + counter);
        System.out.println("The sum of all primes : " + sum);
    }

    public static void main(String[] args) {
        bellow2Millons();

    }
}