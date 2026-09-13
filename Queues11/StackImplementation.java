package Queues11;

import java.util.Stack;
class Queue1 {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> help = new Stack<>();
    // Add
    void add(int data) {
        st.push(data);
    }
    // Remove
    int remove() {
        if (st.isEmpty() && help.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        // stack1 se stack2 mein transfer
        while(st.size() > 1){
            help.push(st.pop());
        }
        int front = st.pop();
        while(help.size() > 0){
            st.push(help.pop());
        }
        return front;
    }
    // Peek
    int peek() {
        if (st.isEmpty() && help.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        while(st.size() > 1){
            help.push(st.pop());
        }
        int peek = st.peek();
        while(help.size() > 0){
            st.push(help.pop());
        }
        return peek;
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Peek: " + q.peek());
        System.out.println("Removed: " + q.remove());
        System.out.println("Removed: " + q.remove());
        System.out.println("Peek: " + q.peek());
    }
}