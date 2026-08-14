public class ToggleCase {

    static String Change(String str){
        String NewStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                NewStr += Character.toLowerCase(ch);
            }
            else{
                NewStr += Character.toUpperCase(ch);
            }
        }
        return NewStr;
    }
    public static void main(String[] args) {
        String name = "AkasH";
        System.out.println(Change(name));
    }
}
