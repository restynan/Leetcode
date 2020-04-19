package com.example.combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum {

    public static List<List<Integer>> findPairs(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;

        int sum = Arrays.stream(arr).sum();

        while (l < r) {
            int sumpair = arr[l] + arr[r];
            if (sumpair == sum - sumpair) {
                result.add(new ArrayList(Arrays.asList(arr[l], arr[r])));
                l++;
                r--;
            }
           else if (sumpair < sum - sumpair) {
                l++;
            } else {
                r--;
            }

        }
        return result;

    }
}
