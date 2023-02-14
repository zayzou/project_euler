package org.example;

import java.math.BigInteger;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 */
public class Problem16 {

    public static void main(String[] args) {
        int n = 1000;
        BigInteger number = BigInteger.valueOf(2).pow(n);
        String str = number.toString();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);
    }
}