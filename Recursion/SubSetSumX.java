package Recursion;

import java.util.ArrayList;

public class SubSetSumX {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = 10;
        printSubsets(new ArrayList<Integer>(), arr, arr.length, 0, sum, 0);
        printOneSubset(new ArrayList<Integer>(), arr, arr.length,0, sum, 0);
        System.out.println(countSubSequence(arr, arr.length, 0,  sum, 0));
    }

    private static void printSubsets(ArrayList<Integer> res, int[] arr, int n, int i, int sum, int currSum) {
        if(i == n) {
            if(currSum == sum) {
                System.out.println(res.toString());
            }
            return;
        }
        res.add(arr[i]);
        currSum += arr[i];
        printSubsets(res, arr, n, i + 1, sum, currSum);
        res.remove(res.size() - 1);
        currSum -= arr[i];
        printSubsets(res, arr, n, i + 1, sum, currSum);
    }

    // for only one subsequence
    private static boolean printOneSubset(ArrayList<Integer> res, int[] arr, int n, int i, int sum, int currSum) {
        if(i == n) {
            if(currSum == sum) {
                System.out.println(res.toString());
                return true;
            }
            return false;
        }
        res.add(arr[i]);
        currSum += arr[i];
        if(printOneSubset(res, arr, n, i + 1, sum, currSum)) return true;
        res.remove(res.size() - 1);
        currSum -= arr[i];
        if(printOneSubset(res, arr, n, i + 1, sum, currSum)) return true;
        return false;
    }

    // count subsequences that sums to a num

    private static int countSubSequence(int[] arr, int n, int i, int sum, int currSum) {
        if(currSum > sum) return 0;
        if(i == n) {
            if(currSum == sum) {
                return 1;
            }
            return 0;
        }

        currSum += arr[i];
        int includes = countSubSequence(arr, n, i + 1, sum, currSum);

        currSum -= arr[i];
        int excludes = countSubSequence(arr, n, i + 1, sum, currSum);

        return includes + excludes;
    }
}