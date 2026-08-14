package Basic;

public class SkipCharcter {

    static void skip(String ans,String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            skip(ans, str.substring(1));
        }
        else{
            skip(ans+ch, str.substring(1));
        }
    }
    public static void main(String[] args) {
        skip("","baccad");
    }
}
