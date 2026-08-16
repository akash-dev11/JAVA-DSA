package Easy;
// Leetcode 796 problem number
public class rotate {
    static boolean check(String s, String a){
        if(s.length()!=a.length()){
            return false;
        }
        return (s+s).contains(a);
    }
    public static void main(String[] args) {
        String name = "akash";
        String goal = "ashak";
        System.out.println(check(name, goal));
    }
}
