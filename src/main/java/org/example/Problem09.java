package org.example;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Problem09 {

    static void findA_B_C() {

        for (int a = 1; a < 999; a++) {
            for (int b = a + 1; b < 1000-a; b++) {
                long c = (long) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                boolean isEqualto1000 = a + b + c == 1000;   //a+b+c =1000
                boolean pythagorianTriplet = a * a + b * b == c * c; //c^2 = √a^2+b^2
                if (isEqualto1000 && pythagorianTriplet) {
                    System.out.println(a + " " + b + " " + c);
                    System.out.println(a * b * c);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        findA_B_C();

    }
}