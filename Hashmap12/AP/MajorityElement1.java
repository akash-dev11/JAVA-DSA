package Hashmap12.AP;

import java.util.HashMap;

public class MajorityElement1 {
    public static void main(String[] args) {
        int nums[] = {1,3,2,5,1,3,1,5,1};

        HashMap<Integer,Integer>  map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }

        for(int key: map.keySet()){
            if(map.get(key) > nums.length/3 ){
                System.out.println(key);
            }
        }
    }
}
