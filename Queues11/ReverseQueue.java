package Queues11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    static void reverse(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        // Queue se Stack mein
        while (!q.isEmpty()) {
            st.push(q.remove());
        }
        // Stack se Queue mein
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    }
    static void display(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        display(q);
        reverse(q);
        display(q);
    }
}