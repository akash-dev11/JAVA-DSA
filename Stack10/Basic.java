package Stack10;

import java.util.Stack;

public class Basic {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.peek());
        System.out.println(arr.pop());
    }
}
