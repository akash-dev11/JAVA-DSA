package Easy;

public class Panagram {
    static boolean check(String s){
        boolean[] arr = new boolean[26];
        int n = s.length();
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                arr[c-'A'] = true;
            }
            else if(c>='a' && c<='z'){
                arr[c-'a'] = true;
            }
        }
        for(int i=0; i<26; i++){
            if(!arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "The quick brown fox jumps over the lazy dog";
        System.out.println(check(name));

    }
}
