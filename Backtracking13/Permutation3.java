package Backtracking13;

import java.util.HashSet;

public class Permutation3 {
    public static void permutation(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return ;
        }
        HashSet<Character> hs = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(hs.contains(ch)){
                continue;
            }
            hs.add(ch);
            String newStr = str.substring(0,i) + str.substring(i+1);
            permutation(newStr, ch+ans);
        }
    }
    public static void main(String[] args) {
        String str = "aac";
        permutation(str, "");
    }
}
