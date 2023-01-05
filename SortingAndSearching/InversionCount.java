import java.util.ArrayList;

public class InversionCount {
    
    public static int merge(ArrayList<Integer> array, int start, int end){
        int i = start;
        int mid = (start + end)/2;
        int j = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;

        while(i <= mid && j <= end){
            if(array.get(i) < array.get(j)){
                temp.add(array.get(i));
                i++;
            }
            else{
                count += (mid - i + 1);
                temp.add(array.get(j));
                j++;
            }
        }

        //copy rem elements from first array
        while(i <= mid) temp.add(array.get(i++));

        // or copy rem elements from second array
        while(j <= end) temp.add(array.get(j++));

        //copy back the elements from temp to original array
        int k = 0 ;
        for(int idx = start; idx <= end; idx++) 
            array.set(idx, temp.get(k++));
        
        return count;
    }

    public static int inversionCount(ArrayList<Integer> arr, int start, int end){
        if(start >= end) return 0;

        int mid = (start + end) / 2;
        int C1 = inversionCount(arr, start, mid);
        int C2 = inversionCount(arr, mid + 1, end);
        int CI =  merge(arr, start, end);

        return C1 + C2 + CI;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(0);
        arr.add(5);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        int start = 0;
        int end = arr.size()-1;
        System.out.println(inversionCount(arr, start, end));
    }
}
