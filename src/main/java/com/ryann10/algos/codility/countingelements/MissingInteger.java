package com.ryann10.algos.codility.countingelements;

        import java.util.Arrays;

/**
 * Url: https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
 * Level: Medium
 * Time spent: 3 minutes
 * Time complexity: O(N) or O(N * log(N))
 * Space complexity: O(1)
 */
public class MissingInteger {

    public int solution(int[] A) {
        Arrays.sort(A);

        int missed = 1;
        for (int num : A) {
            if (num > missed) {
                break;
            } else if (num == missed) {
                missed++;
            }
        }

        return missed;
    }
}
