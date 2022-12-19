// package StringsAndCharacters;

import java.util.ArrayList;
import java.util.Comparator;

public class SortSubsequences {

    public static ArrayList<String> arrayList = new ArrayList<>();
 
    // generate the subsequences of a string in a lexicographical order
    public static void subsequence(String s, String o) {
        if (s.length() == 0) {
            arrayList.add(o);
            return;
        }
        // rec case 
        char ch = s.charAt(0);
        String reducedInput = s.substring(1);
        
        //includes
        subsequence(reducedInput, o + ch);

        //exclude
        subsequence(reducedInput, o);
    }

    public static void main(String[] args) {
        String s = "abc";
        String output =  "";
        subsequence(s, output);
        arrayList.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) return s1.compareTo(s2);
                return s1.length() < s2.length() ? -1 : 1;
            }
        });
        System.out.println(arrayList);

    }
}
