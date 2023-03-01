package org.example;


/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19
 * letters used in total.
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115
 * (one hundred and fifteen) contains 20 letters.
 * The use of "and" when writing out numbers is in compliance with British usage.
 */

public class Problem18 {
    public static int findMaxTotal(int[][] triangle) {
        int n = triangle.length;
        int[][] maxTotals = new int[n][n];

        // Initialize bottom row of maxTotals with values from triangle
        for (int j = 0; j < n; j++) {
            maxTotals[n - 1][j] = triangle[n - 1][j];
        }

        // Calculate maximum totals for each element in triangle
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int maxChildTotal = Math.max(maxTotals[i + 1][j], maxTotals[i + 1][j + 1]);
                maxTotals[i][j] = triangle[i][j] + maxChildTotal;
            }
        }

        // Find maximum total in top row of maxTotals
        int maxTotal = maxTotals[0][0];
        for (int j = 1; j < n; j++) {
            if (maxTotals[0][j] > maxTotal) {
                maxTotal = maxTotals[0][j];
            }
        }

        return maxTotal;
    }


    public static void main(String[] args) {
        int[][] triangle = {
                {75},
                {95, 64},
                {17, 47, 82},
                {18, 35, 87, 10}};
        System.out.println(findMaxTotal(triangle));
    }
}





