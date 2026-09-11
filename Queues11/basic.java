package Queues11;

import java.util.LinkedList;
import java.util.Queue;

public class basic {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(10);
        qu.add(20);
        qu.add(30);
        qu.add(40);
        System.out.println(qu);
        System.out.println(qu.peek());
        qu.remove();
        System.out.println(qu);
        System.out.println(qu.size());
    }
}
