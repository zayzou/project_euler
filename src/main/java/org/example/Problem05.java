package org.example;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem05 {

    static int smallestOne() {
        var number = 2520;
        while (true) {
            var counter = 0;
            for (int i = 1; i <= 20; i++) {
                if (number % i != 0) {
                    break;
                } else {
                    counter++;
                }
            }
            if (counter == 20) {
                return number;
            }
            number++;
        }

    }

    public static void main(String[] args) {
        System.out.println(smallestOne());

    }
}