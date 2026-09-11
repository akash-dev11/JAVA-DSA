package Stack10;

import java.util.Stack;

public class NumberOfvisible {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length; 
        Stack<Integer> st = new Stack<Integer>();
        int ans[] = new int[n];
        for(int i = n-1; i>=0; i--){
            while(st.size() > 0 && heights[i] > st.peek()){
                st.pop();
                ans[i]++;
            }
            if(st.size()>0){
                ans[i]++;
            }
            st.push(heights[i]);
        }
        return ans;
    }
}
