package Queues11;

import java.util.LinkedList;
import java.util.Queue;
class MyStack {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> help = new LinkedList<>();
    // Push
    void push(int data) {
        q.add(data);
    }
    // Pop
    int pop() {
        if (q.size() == 0 && help.size() == 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        while (q.size() > 1) {
            help.add(q.remove());
        }
        int top = q.remove();
        while (help.size() > 0) {
            q.add(help.remove());
        }
        return top;
    }
    // Peek
    int peek() {
        if (q.size() == 0) {
            System.out.println("Stack is Empty");
            return -1;
        }
        while (q.size() > 1) {
            help.add(q.remove());
        }
        int top = q.peek();
        help.add(q.remove());
        while (help.size() > 0) {
            q.add(help.remove());
        }
        return top;
    }
}
public class QueueImplementation {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Peek: " + st.peek());
        System.out.println("Removed: " + st.pop());
        System.out.println("Removed: " + st.pop());
        System.out.println("Peek: " + st.peek());
    }
}