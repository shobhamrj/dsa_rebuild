//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);  // Ensure nums1 is the shorter array

        int n1 = nums1.length;
        int n2 = nums2.length;

        int s = 0, e = n1;
        while (s <= e) {
            int cut1 = s + (e - s) / 2;  // Cut position in nums1
            int cut2 = (n1 + n2 + 1) / 2 - cut1;  // Cut position in nums2

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];  // Left element of cut in nums1
            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];  // Right element of cut in nums1
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];  // Left element of cut in nums2
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];  // Right element of cut in nums2

            if (l1 <= r2 && l2 <= r1) {
                if ((n1 + n2) % 2 == 1) {
                    // Total number of elements is odd, median is the maximum of the left elements
                    return Math.max(l1, l2);
                } else {
                    // Total number of elements is even, median is the average of the maximum of left elements
                    // and the minimum of right elements
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
            } else if (l1 > r2) {
                // The cut in nums1 is too far to the right, move the cut to the left
                e = cut1 - 1;
            } else {
                // The cut in nums1 is too far to the left, move the cut to the right
                s = cut1 + 1;
            }
        }

        return 0.0;  // Default case if arrays are empty
    }
}
