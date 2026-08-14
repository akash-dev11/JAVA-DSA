package Basic;

public class SkipWord {
    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        
        if(str.startsWith("apple")){
            return skip(str.substring(5));
        }
        else{
            return str.charAt(0) + skip(str.substring(1));
        }
    }
    static String skipapp(String str){
        if(str.isEmpty()){
            return "";
        }
        
        if(str.startsWith("app")&& !str.startsWith("apple")){
            return skipapp(str.substring(3));
        }
        else{
            return str.charAt(0) + skipapp(str.substring(1));
        }
    }
    public static void main(String[] args) {
        System.out.println(skip("abscapplesdf"));
        System.out.println(skipapp("sdfdfapplesdfj"));
    }
}
