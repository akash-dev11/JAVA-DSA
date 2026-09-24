package Hashmap12;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingElementRange {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        // Array ke elements HashSet mein daalo
        for(int num : arr) {
            set.add(num);
        }
        // low se high tak check karo
        for(int i = low; i <= high; i++) {
            if(!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
