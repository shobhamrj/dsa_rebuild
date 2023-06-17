package Recursion;

import java.util.*;

// ref - https://leetcode.com/problems/combination-sum-ii/description/
public class CombinationSumTwo {
    static List<List<Integer>> res = new ArrayList<>();


    private static void findCombinations(int idx, int[] arr, int target, ArrayList<Integer> ds) {
        if(target == 0) {
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if(i > idx && arr[i] == arr[i - 1]) continue;
            if(arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8;
        Arrays.sort(arr);
        findCombinations(0, arr, target, new ArrayList<>());
        System.out.println(res.toString());
    }
}
