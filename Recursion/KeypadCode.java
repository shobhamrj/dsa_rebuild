package Recursion;

// give all the combinations according to a keypad, eg -
// input - 23
// output - DG, DH, DI, EG, EH, EI, FG, FH, FI

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeypadCode {

    static List<String> keypad = Arrays.asList("", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" );
    static List<String> res = new ArrayList<>();
    public static void main(String[] args) {
        String num = "23";
        String ds = "";
        helper(num, ds, 0);
        System.out.println(res);
    }

    private static void helper(String num, String ds, int idx) {
        if(num.length() == idx) {
            res.add(ds);
            return;
        }
        int currDigit = num.charAt(idx) - '0';
        if(currDigit == 0 || currDigit == 1) helper(num, ds, idx + 1);
        for(int i = 0; i < keypad.get(currDigit).length(); i++) {
            helper(num, ds + keypad.get(currDigit).charAt(i), idx + 1);
        }
    }
}
