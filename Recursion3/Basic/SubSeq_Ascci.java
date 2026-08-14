package Basic;

import java.util.ArrayList;

public class SubSeq_Ascci {
    static ArrayList<String> sequenceList_ascci(String ans,String str){
        ArrayList<String> List = new ArrayList<>();
        if(str.isEmpty()){
            List.add(ans);
            return List;
        }
        char ch = str.charAt(0);
        List.addAll(sequenceList_ascci(ans+ch,str.substring(1)));
        List.addAll(sequenceList_ascci(ans, str.substring(1)));
        List.addAll(sequenceList_ascci(ans+(ch+0), str.substring(1)));
        return List;
    }

    static void sequence_ascci(String ans,String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        sequence_ascci(ans+ch,str.substring(1));
        sequence_ascci(ans, str.substring(1));
        sequence_ascci(ans+(ch + 0), str.substring(1));
    }
    public static void main(String[] args) {
        sequence_ascci("", "abc");
        System.out.println(sequenceList_ascci("", "abc"));
    }
}
