package Stack10;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreater {
    
    public ArrayList<Integer> nextLargerElement(int[] arr1) {
        int n = arr1.length;
        Stack<Integer> st = new Stack<>();
        int[] neg = new int[n];
        neg[n-1] = -1;
        st.push(arr1[n-1]);
        for(int i=n-2; i>=0; i--){
            while(st.size() > 0 && arr1[i] >= st.peek()){
                st.pop();
            }
            if(st.size() == 0){
                neg[i] = -1;
            }
            else{
                neg[i] = st.peek();
            }
            st.push(arr1[i]);
        }
        ArrayList<Integer> curr = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            curr.add(neg[i]);
        }
        return curr;
    
}
}
