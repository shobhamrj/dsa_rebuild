package Recursion;


import java.util.ArrayList;
import java.util.List;

// ref - https://leetcode.com/problems/palindrome-partitioning/
public class PalindromePartition {

    static List<List<String>> res = new ArrayList<>();

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(partition(s));
    }

    public static List<List<String>> partition(String s) {
        List<String> ds = new ArrayList<>();
        helper(s, 0, ds);
        return res;
    }

    private static void helper(String s, int idx, List<String> ds) {
        if(idx == s.length()) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for(int i = idx; i < s.length(); i++) {
            if(isPalindrome(s, idx, i)) {
                ds.add(s.substring(idx, i + 1));
                helper(s, i + 1, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }

    private static boolean isPalindrome (String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}
