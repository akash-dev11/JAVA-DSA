package Hashmap12.AP;

import java.util.HashMap;

public class Tickets {
    public static String getStart(HashMap<String,String> tic){
        HashMap<String, String> revtic = new HashMap<>();

        for(String ch : tic.keySet()){
            revtic.put(tic.get(ch), ch);
        }

        for(String ch: tic.keySet()){
            if(!revtic.containsKey(ch)){
                return ch;
            }
        }
        return null;
        
    }
    public static void main(String[] args) {
        HashMap<String, String> tic = new HashMap<>();
        tic.put("Chennai", "Bengaluru");
        tic.put("Mumbai", "Delhi");
        tic.put("Goa", "Chennai");
        tic.put("Delhi", "Goa");

        String start = getStart(tic);
        System.out.print(start);
        for(String key : tic.keySet()){
            System.out.print("->"+ tic.get(start));
            start = tic.get(start);
        }

    }
}
