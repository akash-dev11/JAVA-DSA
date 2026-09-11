package Stack10;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

class MyStack{
    Node head;
    int len;
    int peak(){
        if(head == null){
            System.out.println("Stack is Empty!");
            return -1;
        }
        return head.data;
    }
    int pop(){  // deleteAtHead
        if(head == null){
            System.out.println("Stack is Empty!");
            return -1;
        }
        int x = head.data;
        head = head.next;
        len--;
        return x;
    }
    void push(int ele){  // addAtHead
        Node temp = new Node(ele);
        if(len == 0){
            head = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }
    int size(){
        return len;
    }

    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class LLImplentationOfStack {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.display();
        st.pop();
        st.display();
    }
}
