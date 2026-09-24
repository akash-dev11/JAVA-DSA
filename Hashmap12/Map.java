package Hashmap12;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new  HashMap<>();
        map.put("akash", 21);
        map.put("vivek",20);
        map.put("aditya", 20);
        for(String key : map.keySet()){
            System.out.print(key + " " + map.get(key)+" ,");
        }
        System.out.println(map.remove("aditya"));
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.containsKey("akash"));
        System.out.print(map.get("akash"));

    }
}
