package StringsAndCharacters;

import java.util.ArrayList;

public class Tokenization {

    // Problem statement: tokenization a string(split the string with some delimiter(s))

    public static ArrayList<StringBuilder> tokens = new ArrayList<>();

    public static void tokenize(StringBuilder str, char delimiter) {
        int startIdx = 0;
        int i;
        for(i = 0; i < str.length(); i++) {
            if(str.charAt(i) == delimiter) {
                createResultantString(str, startIdx, i - 1);
                startIdx = i + 1;
            }
        }
        if(i == str.length()) createResultantString(str, startIdx, i - 1);
    }

    public static void createResultantString(StringBuilder str, int startIdx, int endIdx) {
        StringBuilder token = new StringBuilder();
        for(int i = startIdx; i <= endIdx; i++) 
            token.append(str.charAt(i));
        tokens.add(token);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("how,are,you!");
        tokenize(str, ',');
        System.out.println(tokens);
    }
}