package org.example;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class Problem07 {

    static void primes() {
        int limit = 105_000;
        int start = 2;
        int[] M = new int[limit];
        int iteration = 1;
        for (int i = start; i < limit; i++) {
            if (M[i] != 1) {
                ++iteration;
                for (int j = i + 1; j < limit; j++) {
                    if (j % i == 0) {
                        M[j] = 1;
                    }

                }
            }
        }

        System.out.println("-----------------------");
        System.out.println("Fin de calcule, nombre d'iteration : #" + iteration); //10025 104999

        int conteur = 1;
        for (int i = start; i < limit; i++) {
            if (M[i] == 0) {
                System.out.print("#" + conteur++ + ": " + i);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        primes();

    }
}