package Stack10;

import java.util.Stack;
public class Reverse {

    static void reverse(Stack<Integer> arr1){
        if(arr1.size() <= 1){
            return ;
        }
        int top = arr1.pop();
        reverse(arr1);
        Pushdown(arr1,top);
    }

    static void Pushdown(Stack<Integer> arr,int value){
        if(arr.size() == 0){
            arr.push(value);
            return ;
        }

        int top = arr.pop();
        Pushdown(arr, value);
        arr.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> arr = new Stack<>();
        arr.push(10);
        arr.push(20);
        arr.push(30);
        arr.push(40);
        arr.push(50);
        System.out.println(arr);
        reverse(arr);
        System.out.println(arr);
        // Stack<Integer> arr1 = new Stack<>();
        // while(arr.size() > 0){
        //     arr1.push(arr.pop());
        // }

        // Stack<Integer> arr2 = new Stack<>();
        // while(arr1.size() > 0){
        //     arr2.push(arr1.pop());
        // }

        // while(arr2.size() > 0){
        //     arr.push(arr2.pop());
        // }
        // System.out.println(arr);
    }
}
