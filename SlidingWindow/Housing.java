public class Housing {

    // find all the sub array from an array whose sum is K
    public static void findSubArray(int[] arr, int k) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int curSum = 0;
        while (j < n) {
            // expand the window to right
            curSum += arr[j];
            j++;
            // contract window from left
            while (curSum > k && i < j) {
                curSum = curSum - arr[i];
                i++;
            }
            if (curSum == k) {
                System.out.println(i + " - " + (j - 1));
            }

        }
    }

    // public static void main(String[] args) {

    // int arr[] = {1, 3, 2, 1, 4, 1, 3, 2, 1, 1};
    // int k = 8;
    // findSubArray(arr, k);
    // }
}
