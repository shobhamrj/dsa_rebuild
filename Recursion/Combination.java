package Recursion;

import java.util.ArrayList;
import java.util.List;

// ref - https://leetcode.com/problems/combinations/description/
public class Combination {

    static List<List<Integer>> res = new ArrayList<>();

    private static void helper(int n, int k, int start, ArrayList<Integer> ds) {
        if(ds.size() == k) {
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i = start; i <= n; i++) {
            ds.add(i);
            helper(n, k, i + 1, ds);
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        helper(n, k, 1, new ArrayList<>());
        System.out.println(res.toString());
    }
}
