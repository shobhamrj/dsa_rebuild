package ArraysVector;

import java.util.Arrays;

public class MinimumDifference {

    public static Pair closestDifference(int[] a1, int[] a2) {
        if (a1 == null || a2 == null)
            return new Pair(-1, -1);
        Pair res = new Pair();
        int globalMinDiff = Integer.MAX_VALUE;

        Arrays.sort(a1);
        Arrays.sort(a2);

        for (int i = 0, j = 0; i < a1.length && j < a2.length;) {
            int curMinDiff = a1[i] - a2[j];
            if (curMinDiff < globalMinDiff) {
                globalMinDiff = curMinDiff;
                res.first = a1[i];
                res.second = a2[j];
            }
            if (a1[i] < a2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res;
    }

    private static class Pair {
        int first;
        int second;

        Pair() {
            this.first = 0;
            this.second = 0;
        }

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
