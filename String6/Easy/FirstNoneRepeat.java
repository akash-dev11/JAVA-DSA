package Easy;

public class FirstNoneRepeat {

// Approach 1 => O(n^2) 
    static char None_repeat(String s){
        int n = s.length();
        boolean found = false;
        for(int i=0; i<n; i++){
            found = false;
            for(int j=0; j<n; j++){
                if(i!=j && s.charAt(i)==s.charAt(j)){
                    found =true;
                    break;
                }
            }
            if(!found){
                return s.charAt(i);
            }
        }
        return '$';
    }
// Approch 2 => O(n+26)
    static char good(String s){
        int n = s.length();
        int[] fre = new int[26];
        char[] arr = s.toCharArray();
        for(int i=0; i<n; i++){
            fre[arr[i]-'a']++;
        }
        for(int i=0; i<n; i++){
            if(fre[arr[i]-'a']==1){
                return arr[i];
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String name = "akashk";
        System.out.println(None_repeat(name));
        System.out.println(good(name));
    }
}
