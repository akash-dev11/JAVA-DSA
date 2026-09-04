
class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
    }
}
public class Display {

    public static int get(Node head,int inx){
        Node tem = head;
        for(int i = 0; i<inx; i++){
            tem = tem.next;
        }
        return tem.value;
    }

    public static void displayRec(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.value);
        displayRec(head.next);
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp =  temp.next;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10); 
        Node b = new Node(20);
        Node c = new Node(30); 
        Node d = new Node(40); 
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        displayRec(a);
        System.out.println(get(a,3));
    }
}
