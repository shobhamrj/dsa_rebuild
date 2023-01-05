import java.util.Arrays;

public class MergeSort {
    
    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] temp = new int[left.length + right.length];
        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                temp[k] = left[i];
                i++;
                k++;
            } else {
                temp[k] = right[j];
                j++;
                k++;
            }
        }

        while(i < left.length) {
            temp[k] = left[i];
            i++;
            k++;
        }

        while(j < left.length) {
            temp[k] = right[j];
            j++;
            k++;
        }
        
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 0, 7, 6, 4};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
