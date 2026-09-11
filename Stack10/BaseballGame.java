package Stack10;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<Integer>();

        for(int i=0; i<arr.length; i++){
            String num = arr[i];
            if(num.equals("D")){
                st.push(st.peek()*2);
            }
            else if(num.equals("C")){
                st.pop();
            }
            else if(num.equals("+")){
                int top = st.pop();
                int second = st.peek();
                int cur = top + second;
                st.push(top);
                st.push(cur);
            }
            else{
                st.push(Integer.parseInt(num));
            }
        }
        int sum = 0;
        while(st.size() > 0){
            sum += st.pop();
        }

        return sum;
    }
}
