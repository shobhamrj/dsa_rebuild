package Recursion;

import java.util.ArrayList;
import java.util.Collections;

// ref - https://practice.geeksforgeeks.org/problems/subset-sums2234/1
public class SunSetSum {
    static ArrayList<Integer> res = new ArrayList<>();

    public static void findSum(ArrayList<Integer> arr, int idx, int sum) {
        if(idx == arr.size()) {
            res.add(sum);
            return;
        }
        findSum(arr, idx + 1, sum + arr.get(idx));
        findSum(arr, idx + 1, sum);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        findSum(arr, 0, 0);
        Collections.sort(res);
        System.out.println(res.toString());
    }
}
