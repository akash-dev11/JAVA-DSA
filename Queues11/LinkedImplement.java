package Queues11;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Queue {
    Node head;
    Node tail ;

    // Add element
    void add(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Remove element
    void remove() {
        if (head == null) {
            System.out.println("Queue is empty");
            return ;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    
    }
    // Display
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedImplement {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        q.remove();
        q.display();
    }
}