package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsTest {


    @org.junit.jupiter.api.Test
    void isPrime() {
        assertTrue(Problems.isPrime(17));
        assertFalse(Problems.isPrime(465));
        assertTrue(Problems.isPrime(7919));
        assertTrue(Problems.isPrime(17));
        assertTrue(Problems.isPrime(23));
        assertFalse(Problems.isPrime(4));
        assertTrue(Problems.isPrime(3));

    }

    @Test
    void primeFactors() {
        assertArrayEquals(Problems.primeFactors(17), new int[]{17});
        assertArrayEquals(Problems.primeFactors(6), new int[]{2, 3});
        assertArrayEquals(Problems.primeFactors(465), new int[]{3, 5, 31});
        assertArrayEquals(Problems.primeFactors(7919), new int[]{7919});
        assertArrayEquals(Problems.primeFactors(15), new int[]{3, 5});
        assertArrayEquals(Problems.primeFactors(6893), new int[]{61, 113});
    }
}