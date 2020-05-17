package com.ryann10.algos.codility.arrays;

/**
 * Url: https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 * Level: Easy
 * Time spent: 19 minutes
 * Time complexity: O(n)
 * Space complexity: O(n)
 */
public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        if (A.length == 0 || K == 0) {
            return A;
        }

        int shift = K % A.length;

        int[] arr = new int[shift];

        for (int i = 0; i < shift; i++) {
            arr[i] = A[A.length - shift + i];
        }

        for (int i = A.length - shift - 1; i >= 0; i--) {
            A[i + shift] = A[i];
        }

        for (int i = 0; i < arr.length; i++) {
            A[i] = arr[i];
        }

        return A;
    }
}
