package Hashmap12;

import java.util.HashMap;

public class AllPairsWithDiffK {
    public static  int getvalue(int a[],int k){
        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int num : a){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int count = 0;
        for(int num : a){
            if(map.containsKey(num+k)){
                count += map.get(num+k);
            }
        }
        return count;
    }
    public static void main(String[] args) {
       
    }
}
