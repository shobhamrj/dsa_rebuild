package StringsAndCharacters;

public class ReverseWord {

    public static void main(String[] args) {
        String a = "  hello world  ";
        System.out.println(reverseWords(a)); 
    }
    
    public  static String reverseWords(String s) {
        String arr[] = s.split("\s+");
        StringBuilder str = new StringBuilder();
        for(int i = arr.length-1; i >= 0; i--){
            str.append(arr[i].trim() + " ");
        }
        return str.toString().trim();
    }
}


