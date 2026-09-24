package Hashmap12;

import java.util.HashSet;

public class TwoSum {
    public static boolean sum(){
        HashSet<Integer> set = new HashSet<>();
        int arr[] = {};
        int target = 0;
        for(int ar : arr){
            int rem = target - ar;
            if(set.contains(arr)) return true;
            set.add(ar);
        }
    }
}
