package org.example;

import java.util.Arrays;

public class Problems {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] primeFactors(int n) {
        if (isPrime(n)) {
            return new int[]{n};
        }
        int[] result={};
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && isPrime(i)) {
                int[] prime = primeFactors(n / i);
                result = new int[prime.length + 1];
                result[result.length-1] = i;
                System.arraycopy(prime, 0, result, 0, prime.length);
            }
        }
        return Arrays.stream(result).sorted().toArray();
    }
}
