package Easy;
public class Subsequence {

    static boolean issubSequence(String s1,String s2){
        int n = s1.length();
        int m =s2.length();
        int i=0,j=0;
        while(i<n && j<m){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
            }
            j++;
        }
        return i==n;
    }
    public static void main(String[] args) {
        String s1 = "axyj";
        String s2 = "adxcpy";
        if(issubSequence(s1,s2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
