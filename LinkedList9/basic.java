package LinkedList9;

class Node{
    int value;
    Node next;
    Node(int value){
        this.value = value;
    }
}
public class basic {
    public static void main(String[] args) {

        Node a = new Node(10);
        // a.value = 10;
        Node b = new Node(20);
        // b.value = 20;
        Node c = new Node(30);
        // c.value = 30;
        Node d = new Node(40);
        // d.value = 40;
        Node e = new Node(50);
        // e.value = 50;
        // System.out.println(a.value);
        // System.out.println(a.next);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(a.next.next);
    }
}
