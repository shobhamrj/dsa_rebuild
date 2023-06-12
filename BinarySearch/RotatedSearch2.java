//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
        int s = 0, e = n - 1;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (target == nums[mid]) { // If target is found at mid index, return true
                return true;
            }
            
            if (nums[mid] == nums[e] && nums[mid] == nums[s]) { // Handling duplicates
                s++; // Move the start pointer forward
                e--; // Move the end pointer backward
            } else if (nums[mid] >= nums[s]) { // Left half is sorted
                
                if (nums[mid] >= target && target >= nums[s]) { // Target lies between start and mid
                    e = mid - 1; // Adjust end pointer to search in the left half
                } else {
                    s = mid + 1; // Adjust start pointer to search in the right half
                }
            } else { // Right half is sorted
                
                if (nums[mid] <= target && target <= nums[e]) { // Target lies between mid and end
                    s = mid + 1; // Adjust start pointer to search in the right half
                } else {
                    e = mid - 1; // Adjust end pointer to search in the left half
                }
            }
        }

        return false; // Target not found
    }
}
