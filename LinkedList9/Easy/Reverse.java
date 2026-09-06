package Easy;

import java.util.ArrayList;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
    }
}

public class Reverse {
    static Node1 reverse(Node1 head){
        Node1 temp = head;
        ArrayList<Node1> arr = new ArrayList<>();
        while(temp != null){
            arr.add(temp);
            temp = temp.next;
        }
        int n = arr.size();
        for(int i=n-1; i>=1; i--){
            arr.get(i).next = arr.get(i-1);
        }
        arr.get(0).next = null;
        head = arr.get(n-1);
        return  head;
    }
    static Node1 Rever(Node1 head){
        Node1 pre = null;
        Node1 cur = head;
        Node1 fw = null;
        while (cur != null) {
            fw = cur.next;
            cur.next = pre;
            pre = cur;
            cur = fw;
        }
        return pre;
    }

    static Node1 recurson(Node1 head){
        if(head.next == null || head == null){
            return  head;
        }
        Node1 a = head.next;
        head.next = null;
        Node1 b = recurson(a);
        a.next = head;
        return  b;
    }
    public static void main(String[] args) {
        Node1 list1 = new Node1(1);
        list1.next = new Node1(3);
        list1.next.next = new Node1(5);
        list1.next.next.next = new  Node1(10);
        // Node1 head = reverse(list1);
        // Node1 temp = head;

        // Node1 head = Rever(list1);
        // Node1 temp = head;

        Node1 head = reverse(list1);
        Node1 temp = head;   
        
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
}

