package Recursion;


// generate n opening and closing brackets which are valid ones

import java.util.ArrayList;
import java.util.List;

public class GenerateBrackets {
    static List<String> res = new ArrayList<>();

    public static void main(String[] args) {
        int n = 1;
        String ds = "";
        generateBrackets(n, 0, 0, 0, ds);
        System.out.println(res);
    }

    private static void generateBrackets(int n, int open, int close, int idx, String ds) {
        if(idx == 2 * n) {
            res.add(ds);
            return;
        }
        if(open < n) generateBrackets(n, open + 1, close, idx + 1, ds + "(");
        if(close < open) generateBrackets(n, open, close + 1, idx + 1, ds + ")");
    }
}
