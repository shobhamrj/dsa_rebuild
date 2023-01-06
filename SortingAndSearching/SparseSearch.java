public class SparseSearch {
    
    // modified binary search for finding the index of an element in an array of String
    public static int sparseSearch(String[] arr, String key) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            int midLeft = mid - 1;
            int midRight = mid + 1;

            if(arr[mid].equals("")) {
                while(true) {
                    if(midLeft < start && !arr[midRight].equals("")) {
                        mid = midRight;
                        break;
                    } 
                    else if(midRight <= end && !arr[midRight].equals("")) {
                        mid = midLeft;
                        break;
                    }
                    midLeft--;
                    midRight++;
                }
            }
            
            else if(arr[mid].equals(key))
                return mid;

            else if(arr[mid].compareTo(key) > 0)
                end = mid - 1;

            else 
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"ai", "", "","bat", "","","car","cat","","","dog",""};
        String key = "dog";
        System.out.println(sparseSearch(arr, key));
    }
}
