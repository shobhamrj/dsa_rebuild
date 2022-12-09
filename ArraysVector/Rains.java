package ArraysVector;

public class Rains {
    // very popular trapping rain water
    public static int trappedRain(int[] heights) {
        int n = heights.length;
        if(n <= 2) return 0;
        int[] left = new int[n - 1];
        int[] right = new int[n - 1];
        left[0] = heights[0];
        right[n - 1] = heights[n - 1];
        for(int i = 1; i < n; i++) {
            left[i] = Math.max(right[i - 1], heights[i]);
            right[n - i - 1] = Math.max(right[n - i], heights[n - i - 1]);
        }
        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            trappedWater += Math.min(left[i], right[i]) - heights[i];
        }
        return trappedWater;
    }
}