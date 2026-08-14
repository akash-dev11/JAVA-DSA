package Easy;

// 1832 problem number on leetcode
public class SentencePangram {

    public static boolean checkPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        for(int ch = 'a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
               return false;
            }
        }
       return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPangram("abcdefghijklldfjdkfjasdfksdj"));
    }
}
