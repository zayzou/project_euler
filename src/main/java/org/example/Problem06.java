package org.example;

/**
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * The square of the sum of the first ten natural numbers is,
 * <p>
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * .
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem06 {

    public static void main(String[] args) {

        var sum1 = 0;
        var sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            sum1 += i * i; //The sum of the squares
            sum2 += i;
        }
        var diff = sum2*sum2-sum1 ; //sum of the squares of the first one hundred natural numbers and the square of the sum.
        System.out.println(diff);
    }
}