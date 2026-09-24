package Hashmap12;

import java.util.HashMap;

public class MostFrequant {
    public char getMaxOccuringChar(String s){
        s = "akash";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(map)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        char ans = s.charAt(0);
        for(char ch : s.toCharArray()){
            if(map.get(ch) > map.get(ans) ){
                ans = ch;
            }
            else if(map.get(ch) == map.get(ans) && ch < ans){
                ans = ch;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        
    }
}
