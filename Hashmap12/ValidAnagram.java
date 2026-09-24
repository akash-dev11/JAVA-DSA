package Hashmap12;

import java.util.HashMap;

public class ValidAnagram {
    
    public static boolean areAnagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            return true;
        }
        HashMap<Character, Integer>  map = new HashMap<>();

        for(char ch: s1.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        for(char ch : s2.toCharArray()){
            if(!map.containsKey(ch)){
                return false;
            }
            map.put(ch, map.get(ch)-1);
            if(map.get(ch) == 0){
                map.remove(ch);
            }
        }
        return map.isEmpty();
    }
}
