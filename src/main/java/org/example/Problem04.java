package org.example;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem04 {


    static boolean isPalindrome(long number) {
        StringBuilder sb = new StringBuilder(Long.toString(number));
        sb.reverse();
        Long.parseLong(sb.toString());
        return Long.parseLong(sb.toString()) == number;
    }

    public static void main(String[] args) {

        long product = 1;
        long max = 1;
        for (int i = 100; i < 999; i++) {
            for (int j = i; j < 999; j++) {
                product = i * j;
                if (isPalindrome(product) && max < product) {
                    max = product;
                }
            }
        }
        System.out.println(max);
    }
}