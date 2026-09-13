package Queues11;

import java.util.LinkedList;
import java.util.Queue;

public class Implementation {
    static  void  display(Queue q){
        int n  = q.size();
        for(int i=1; i<=n; i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
    }

    static void insert(int index, int value, Queue<Integer> q){
        int n = q.size();
        for(int i=0; i<index; i++){
            q.add(q.remove());
        }

        q.add(value);

        for(int i=0; i<n-index; i++){
            q.add(q.remove());
        }


    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40); 
        q.add(50);
        display(q);
        insert(1, 15, q);
        display(q);

    }
}
