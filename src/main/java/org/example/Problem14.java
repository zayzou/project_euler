package org.example;

import java.util.HashMap;

/**
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 * Which starting number, under one million, produces the longest chain?
 * NOTE: Once the chain starts the terms are allowed to go above one million
 */

public class Problem14 {


    static HashMap<Long, Integer> map = new HashMap<>();

    static int collatzLength(long num) {
        int count = 1;
        while (num != 1) {
            if (map.containsKey(num)) {
                count += map.get(num) - 1;
                return count;
            }
            count++;
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
        }
        map.put(num, count);
        return count;
    }

    public static void main(String[] args) {
        int maxLength = 0;
        int maxNum = 0;
        for (int i = 1; i < 1_000_000; i++) {
            int length = collatzLength(i);
            if (length > maxLength) {
                maxLength = length;
                maxNum = i;
            }
        }
        System.out.println("Starting number producing longest chain: " + maxNum);
        System.out.println("Length of longest chain: " + maxLength);
    }
}