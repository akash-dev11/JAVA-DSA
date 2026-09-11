package Stack10;

import java.util.Stack;

public class PushAtBottom {

    static void pushAtBottom(Stack<Integer> st, int x) {

        if (st.size() == 0) {
            st.push(x);
            return;
        }

        int top = st.pop();

        pushAtBottom(st, x);

        st.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        pushAtBottom(st, 5);

        System.out.println(st);
    }
}