package LinkedList9.Easy;

class node{
    int data;
    node next;
    node(int data){
        this.data = data;
    }
}

class linkedlist {
    node head;

    void add(int data){
        node newNode = new node(data);
        if(head==null){
            head = newNode;
            return;
        }
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void swapvalue(int idx){
        node slow = head;
        node fast = head;

        for(int i=1; i<=idx; i++){
            fast = fast.next;
        }

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        fast = head;
        for(int i=1; i<=idx-1; i++){
            fast = fast.next;
        }
        int temp = fast.data;
        fast.data = slow.data;
        slow.data = temp;
    }
}

public class Swap {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Before Swap:");
        list.display();

        list.swapvalue(2);

        System.out.println("After Swap:");
        list.display();
    }
}
