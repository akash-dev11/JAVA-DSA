package Stack10;

import java.util.Stack;

public class ValidPar {
     public boolean samePar(char a, char b){
        if(a == '(' && b == ')') return true;
        if(a == '[' && b == ']') return true;
        if(a == '{' && b == '}') return true;
        return false;
    }
    public boolean isBalanced(String s) {
        Stack<Character> str = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                str.push(ch);
            }
            else{
                if(str.size() == 0){
                    return false;
                }
                char top = str.peek();
                if(samePar(top,ch)){
                    str.pop();
                }
                else{
                    return false;
                }
            }
        }
        return (str.size()==0);
    }
    public static void main(String[] args) {
        
    }
}
