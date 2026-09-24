package Hashmap12;

import java.util.HashMap;

public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        // Frequency of a[]
        for(int num : a) {
            if(map1.containsKey(num)) {
                map1.put(num, map1.get(num) + 1);
            }
            else {
                map1.put(num, 1);
            }
        }
        // Frequency of b[]
        for(int num : b) {
            if(map2.containsKey(num)) {
                map2.put(num, map2.get(num) + 1);
            }
            else {
                map2.put(num, 1);
            }
        }
        // Check subset
        for(int num : map2.keySet()) {
            if(!map1.containsKey(num)) {
                return false;
            }
            if(map2.get(num) > map1.get(num)) {
                return false;
            }
        }
        return true;
    }
}
