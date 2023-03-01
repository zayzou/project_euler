package org.example;


/**
 * The Fibonacci sequence is defined by the recurrence relation:
 * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 */
//todo not finished yet ❌
public class Problem25 {

    static int count = 0;

    static long fibonacci(int n) {
        count++;
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static int numberOfDigits(long n) {
        return (int) (Math.log10(n) + 1);
    }

    public static void main(String[] args) {
        //we solve this using ....
        long n = Math.round((999 * Math.log10(10) + Math.log10(5) / 2) / Math.log10(Math.PI));
        System.out.println(n);

    }
}