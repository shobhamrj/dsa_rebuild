package ArraysVector;

import java.util.Arrays;

public class MinSwap {

    // Problem statement: count the minimum number of swaps to make an array sorted
    public static int minSwap(int[] arr1) {
        int n = arr1.length;
        Pair[] arr = new Pair[n];
        for(int i = 0; i < n; i++) {
            arr[i] = new Pair(arr1[i], i);
        }
        Arrays.sort(arr);

        int res = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(visited[i] == true || arr[i].idx == i) continue;
            int cycle = 0;
            int j = i;
            while(!visited[j]) {
                visited[j] = true;
                cycle++;
                j = arr[j].idx;
            }
            res += (cycle - 1);
        }
        return res;
    }

    private static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        Pair (int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Pair o) {
            return this.val - o.val;
        }
    }
}