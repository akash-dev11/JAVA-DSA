package Stack10;

import java.util.Stack;

public class Traverse {
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();
        arr.add(10);
        arr.add(40);
        arr.add(-2);
        arr.add(30);
        arr.add(80);

        Stack<Integer> arr1 = new Stack<>();
        while(arr.size() > 0){
            int top = arr.pop();
            System.out.println(top);
            arr1.push(top);
        }

        while(arr1.size() > 0){
            arr.push(arr1.pop());
        }
    }
}
