

public class RemoveAllOccurance {
    static String remove_occurance(String str,char ch){
        StringBuilder Newstr = new StringBuilder(str);
        for(int i=0; i<Newstr.length(); i++){
            if(Newstr.charAt(i)==ch){
                Newstr.deleteCharAt(i);
                i--;
            }
        }
        return Newstr.toString();
    }

    static String built(String str,char ch){
        str = str.replace(String.valueOf(ch), "");
        return str;
    }
    public static void main(String[] args) {
        String str = "adbakdfj";
        char ch = 'a';
        System.out.println(remove_occurance(str, ch));
        System.out.println(built(str, ch));
    }
}
