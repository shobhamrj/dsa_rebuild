import java.util.ArrayList;

public class QuickSelect {
    
    // Find the kth smallest element from the array (with Quick Sort algorithm) 
    public static int quickSelect(ArrayList<Integer> ar, int start, int end, int k) {
        int p = partition(ar, start, end);
        if(p == k) return ar.get(p);
        else if (k < p) return quickSelect(ar, start, p - 1, k);
        else return quickSelect(ar, p + 1, end, k);
    }

    public static int partition(ArrayList<Integer> a, int start, int end) {
        int pivot = a.get(end);
        int i = start - 1;
        for(int j = start; j < end; j++) {
            if(a.get(j) < pivot) {
                i++;
                swap(a, i, j);
            }
        } 
        swap(a, i + 1, end);
        return i + 1;
    }

    private static void swap(ArrayList<Integer> a, int i, int j) {
        int temp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, temp);
    }


    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(5);
        ar.add(4);
        ar.add(2);
        ar.add(3);
        ar.add(1);
        int n = ar.size();
        int k = 3;
        System.out.println(quickSelect(ar, 0, n-1, k));
    }
}
