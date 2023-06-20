package Recursion;

import java.util.ArrayList;
import java.util.List;


// ref - https://leetcode.com/problems/permutations/description/
public class Permutations {

    static List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permute(nums);
        System.out.println(res);
    }

    public static void permute(int[] nums) {
        helper(nums, 0);
    }

    private static void helper(int[] arr, int idx) {
        if(idx == arr.length) {
            List<Integer> ds = new ArrayList<>();
            for (int j : arr) {
                ds.add(j);
            }
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i = idx; i < arr.length; i++) {
            swap(i, idx, arr);
            helper(arr, idx + 1);
            swap(i, idx, arr);
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
