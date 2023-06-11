package Recursion;

import java.util.ArrayList;

public class SubSequence {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        printSubSequence(arr, new ArrayList<Integer>(), arr.length , 0);
    }

    private static void printSubSequence(int[] arr, ArrayList<Integer> res, int size, int i) {
        if(i == size) {
            System.out.println(res.toString());
            return;
        }
        res.add(arr[i]);
        printSubSequence(arr, res, size, i + 1);
        res.remove(res.size() - 1);
        printSubSequence(arr, res, size, i + 1);
    }
}
