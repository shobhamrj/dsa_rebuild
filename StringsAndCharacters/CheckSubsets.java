package StringsAndCharacters;

public class CheckSubsets {
    
    // check if a string s have another string x as its subset
    public static boolean checkSubset(String str, String subSet) {
        int i = str.length() - 1;
        int j = subSet.length() - 1;

        while (i >= 0 && j >= 0) {
            if(str.charAt(i) == subSet.charAt(j)) {
                i--;
                j--;
            } else {
                i--;
            }
        }
        return i == -1;
    }
}
