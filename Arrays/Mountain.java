package Arrays;

public class Mountain {

    public static int highestMountain(int[] a){
        int n = a.length;
        int largest = 0;
        for(int i = 1; i <= n;) {
            if(a[i] < a[i - 1] && a[i] > a[i + 1]) {
                int count = 1;
                int j = i;
                while (j >= 1 && a[j] > a[j - 1]) {
                    count ++;
                    j--;
                }
                while (j < n - 2 && a[i] > a[i + 1]) {
                    count++;
                    i++;
                }
                largest = Math.max(largest, count);

            } else {
                i++;
            }
        }
        return largest;
    }
}
