package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int sum = 7;
        List<List<Integer>> res = triplets(arr, sum);
        System.out.println(res.toString());
    }

    public static List<List<Integer>> triplets(int[] arr, int sum) {
        //sort the array if array is not sorted
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        for(int i = 0; i <= n - 3; i++) { //picked first number
            int j = i + 1; // took 2nd and 3 number
            int k = n - 1;
            while(j < k) {  // two pointer approach from 2Sum problem
                int targetSum = arr[i];
                targetSum += arr[j];
                targetSum += arr[k];
                if(targetSum == sum){
                    res.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                }
                else if(targetSum > sum){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return res;
    }
}