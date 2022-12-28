import java.util.HashMap;

public class UniqueSubstring {

    // find largest substring with unique characters
    public static String uniqueSubstring(String str) {
        int i = 0;
        int j = 0;
        int windowLength = 0;
        int maxWindowLength = 0;
        int startWindow = -1;
        HashMap<Character, Integer> map = new HashMap<>();

        while(j < str.length()) {
            char c = str.charAt(j);

            // if it is inside the hashmap
            if(map.containsKey(c) && map.get(c) >= i) {
                i = map.get(c) + 1;
                windowLength = j - i; //u[dated remaining window length excluding current char
            }

            // update the last occurance
            map.put(c, j);
            windowLength++;
            j++;
            
            // update the maxWindowLength every time
            if(windowLength > maxWindowLength) {
                maxWindowLength = windowLength;
                startWindow = i;
            }
        }
        return subStringUtil(str, startWindow, maxWindowLength);
    }

    public static String subStringUtil(String str, int startWindow, int windowLength) {
        int i = startWindow;
        StringBuilder s = new StringBuilder();
        while(windowLength != 0) {
            s.append(str.charAt(i));
            i++;
            windowLength--;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String str = "abcabeb";
        System.out.println(uniqueSubstring(str));     
    }
   
}
