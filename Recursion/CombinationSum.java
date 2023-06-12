package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    // ref - https://leetcode.com/problems/combination-sum/
    static List<List<Integer>> res = new ArrayList<>();

    private static void  findCombination(int idx, int[] arr, int target, List<Integer> ds) {
        if(idx == arr.length) {
            if(target == 0) {
                res.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[idx] <= target) {
            ds.add(arr[idx]);
            findCombination(idx, arr, target - arr[idx], ds);
            ds.remove(ds.size() - 1);
        }

        findCombination(idx + 1, arr, target, ds);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        findCombination(0, arr, target, new ArrayList<Integer>());
        System.out.println(res.toString());

    }
}
