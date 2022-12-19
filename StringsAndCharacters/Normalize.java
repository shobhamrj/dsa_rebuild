package StringsAndCharacters;

public class Normalize {
    
    // You are given a sentence with words separated by spaces.
    // Your task is to, write a function that returns a copy of this sentence where all the words:
    //  start with a capital letter
    //  the rest of the letters are lower case
    public static String normalize(String sentence) {
        StringBuilder copy = new StringBuilder(sentence);
        int idx = 0;
        while(idx < sentence.length()) {
            idx = removeWhiteSpace(copy, idx);
            idx = normalizeWord(copy, idx);
        }
        return copy.toString();
    }

    private static int removeWhiteSpace(StringBuilder sentenceCopy, int idx) {
        while(idx < sentenceCopy.length() && sentenceCopy.charAt(idx) == ' ') idx++;
        return idx;
    }

    private static int normalizeWord(StringBuilder sentenceCopy, int idx) {
        if(idx < sentenceCopy.length() && sentenceCopy.charAt(idx) != ' ') {
            sentenceCopy.setCharAt(idx, Character.toUpperCase(sentenceCopy.charAt(idx)));
            idx++;
        }
        while (idx < sentenceCopy.length() && sentenceCopy.charAt(idx) != ' ') {
            sentenceCopy.setCharAt(idx, Character.toLowerCase(sentenceCopy.charAt(idx)));
            idx++;
        }
        return idx;
    }

    public static void main(String[] args) {
        String s = "tHIS iS mY hOUSE";
        System.out.println(normalize(s));
    }
}
