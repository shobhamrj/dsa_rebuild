package StringsAndCharacters;

public class SpaceTwenty {
    
    // simple updating characters in a string 
    public static StringBuilder replaceSpace(StringBuilder str) {
        //1. calc spaces
        int spaces = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ')
                spaces += 1;
        }

        int idx = str.length() + 2 * spaces;
        str.ensureCapacity(idx);

        for(int i = str.length() - 1; i >= 0; i--){
            if(str.charAt(i) == ' '){
                str.setCharAt(idx - 1, '0');
                str.setCharAt(idx - 2, '2');
                str.setCharAt(idx - 3, '%');
                idx = idx - 3;
            } else{
                str.setCharAt(idx - 1, str.charAt(i));
                idx--;
            }
        }
        return str; 
    }
}
