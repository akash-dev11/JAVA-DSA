package Basic;

import java.util.ArrayList;

public class SubSeq {

    static ArrayList<String> sequenceList(String ans,String str){
        ArrayList<String> List = new ArrayList<>();
        if(str.isEmpty()){
            List.add(ans);
            return List;
        }
        char ch = str.charAt(0);
        List.addAll(sequenceList(ans+ch,str.substring(1)));
        List.addAll(sequenceList(ans, str.substring(1)));
        return List;
    }

    static void sequence(String ans,String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        sequence(ans+ch,str.substring(1));

        sequence(ans, str.substring(1));
    }
    public static void main(String[] args) {
        sequence("", "abc");
        System.out.println(sequenceList("", "abc"));
    }
}
