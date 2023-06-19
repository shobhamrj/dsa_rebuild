package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// ref - https://leetcode.com/problems/subsets-ii/
public class SubSetSum2 {

    private static final List<List<Integer>> res = new ArrayList<>();

    private static void findCom(int[] arr, int idx, ArrayList<Integer> ds) {
        res.add(new ArrayList<>(ds));
        for(int i = idx; i < arr.length; i++) {
            if(i != idx && arr[i] == arr[i - 1]) continue;
            ds.add(arr[i]);
            findCom(arr, i + 1, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2, 2, 3};
        Arrays.sort(arr);
        findCom(arr, 0, new ArrayList<>());
        System.out.println(res);
    }
}
