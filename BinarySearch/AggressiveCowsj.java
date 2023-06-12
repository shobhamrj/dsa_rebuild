//https://practice.geeksforgeeks.org/problems/aggressive-cows/0
class Solution {
    public static boolean isFeasible(int[] stalls, int mid, int n, int k) {
        int count = 1;  // Counter for the number of stalls that can be built
        int prevStall = stalls[0];  // Track the position of the previously built stall
        
        // Iterate over the remaining stalls to check if they satisfy the minimum distance requirement
        for (int i = 1; i < n; i++) {
            if (stalls[i] - prevStall >= mid) {
                count++;
                prevStall = stalls[i];
            }
        }
        
        return count >= k;  // Return true if the required number of stalls can be built, false otherwise
    }
    
    public static int solve(int n, int k, int[] stalls) {
        Arrays.sort(stalls);  // Sort the stalls in ascending order
        int left = 1;  // Minimum possible distance between stalls
        int right = stalls[n - 1] - stalls[0];  // Maximum possible distance between stalls
        int maxDistance = 0;  // Variable to store the maximum feasible distance
        
        // Perform binary search to find the maximum feasible distance
        while (left <= right) {
            int mid = left + (right - left) / 2;  // Calculate the middle distance
            
            if (isFeasible(stalls, mid, n, k)) {
                maxDistance = mid;
                left = mid + 1;  // Search for a larger feasible distance in the right half
            } else {
                right = mid - 1;  // Search for a feasible distance in the left half
            }
        }
        
        return maxDistance;  // Return the maximum feasible distance between stalls
    }
}
