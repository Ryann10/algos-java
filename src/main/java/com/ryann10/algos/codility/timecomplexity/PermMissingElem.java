package com.ryann10.algos.codility.timecomplexity;

import java.util.Arrays;

/**
 * Url: https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 * Level: Easy
 * Time spent: 8 minutes
 * Time complexity: O(N) or O(N * log(N))
 * Space complexity: O(1)
 */
public class PermMissingElem {

    class Solution {
        public int solution(int[] A) {
            Arrays.sort(A);

            int missed = 1;
            for (int num : A) {
                if (num != missed) {
                    break;
                }
                missed++;
            }

            return missed;
        }
    }
}
