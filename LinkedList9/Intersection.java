package LinkedList9;

class Node2 {
    int data;
    Node2 next;
    Node2(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node2 head;
    // Add at end
    void add(int data) {
        Node2 newNode = new Node2(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display
    void display() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int lenght(){
        int len = 0;
        Node2 temp = head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        return len;
    }
    Node2 Intersection(LinkedList list1, LinkedList list2){
        int len1 = list1.lenght();
        int len2 = list2.lenght();

        Node2 temp1 = list1.head;
        Node2 temp2 = list2.head;

        if(len1>len2){
            for(int i=1; i<=len1-len2; i++){
                temp1 = temp1.next;
            }
        }
        else{
            for(int i=1; i<=len2-len1; i++){
                temp2 = temp2.next;
            }
        }

        while(temp1!=temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;

    }
}

public class Intersection {
    public static void main(String[] args) {

        // First Linked List
        LinkedList list1 = new LinkedList();
        list1.add(4);
        list1.add(1);

        // Second Linked List
        LinkedList list2 = new LinkedList();
        list2.add(5);
        list2.add(6);
        list2.add(1);

        // common node 
        Node2 common1 = new Node2(8);
        Node2 common2 = new Node2(4);
        Node2 common3 = new Node2(5);
        common1.next = common2;
        common2.next = common3;

        // list 1 connect to common node
        Node2 temp1 = list1.head;
        while(temp1.next != null){
            temp1 = temp1.next;
        }
        temp1.next = common1;

        // list2 connect to the common node
        Node2 temp2 = list2.head;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        temp2.next = common1;


        System.out.print("List 1: ");
        list1.display();
        System.out.println(list1.lenght());

        System.out.print("List 2: ");
        list2.display();
        System.out.println(list2.lenght());

        Node2 ans = list1.Intersection(list1, list2);

        if(ans !=null){
            System.out.println("Intersection:"+ans.data);
        }
        else{
            System.out.println("No Intersection");
        }
        

    }
}