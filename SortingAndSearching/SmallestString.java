import java.util.Arrays;

public class SmallestString {

    // from the list of strings, concat all the string to form the smallest string in terms of lexicographical order 
    public static void findSmallestString(String[] arr) {
        Arrays.sort(arr, (o1, o2) -> (o1 + o2).compareTo(o2 + o1)); // merge sort approach, while comparing two elements figure out if that goes before or after an element
        for(String s: arr)
            System.out.print(s);
    }

    public static void main(String[] args) {
        String[] arr = {"a", "ab", "aba"};
        findSmallestString(arr);
    }
    
}
