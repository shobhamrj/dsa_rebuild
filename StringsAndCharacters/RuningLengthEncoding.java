package StringsAndCharacters;

public class RuningLengthEncoding {
    
    // Write a function to perform basic string compression using the counts of repeated characters, 
    // also known as Run Length Encoding. Let see one example, the input string "aaaabcccccaaa" would 
    // become "a4b1c5a3". If the "compressed" string would not become smaller than the original string,
    // your function should return the input string. You can assume the string has only uppercase and lowercase letters. 
    public static String encode(String str) {
        int n = str.length();
        String res = "";
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count ++;
                i++;
            }
            res += str.charAt(i);
            res += Integer.toString(count);
        }
        if(res.length() > str.length()) return str;
        return res;
    }
}
