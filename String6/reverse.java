public class reverse {
    static void reverse(String s){
        StringBuilder newStr = new StringBuilder(s);
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            char tem = newStr.charAt(start);
            newStr.setCharAt(start,newStr.charAt(end));
            newStr.setCharAt(end, tem);
            start++;
            end--;
        }
        System.out.println(newStr);

    }
    public static void main(String[] args) {
        String s = "hsaka";
        reverse(s);
        
    }
}
