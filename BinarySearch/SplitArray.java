package BinarySearch;
//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArray {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while (start < end) {

            int mid = start + (end - start) / 2;


            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if (sum + num > mid) {

                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end;
    }
}
