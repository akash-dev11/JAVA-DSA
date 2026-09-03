package LinkedList9;

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data = data;
    }
}

class Middle{
    Node1 head;
    Node1 tail;
    int size;

    // add node at tail
    void addattail(int data){
        Node1 temp = new Node1(data);
        if(tail==null){
            head=tail=temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    // display liskedlist
    void display(){
        Node1 temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // print mid node of linkedlist
    int mid(){
        Node1 temp = head;
        for(int i=1; i<=size/2; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    int slow_fast(){
        Node1 slow = head;
        Node1 fast = head;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    int Kth_from_end(int idx){
        Node1 slow = head;
        Node1 fast = head;
        for(int i=1; i<=idx; i++){
            if(fast==null){
                return -1;
            }
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
public class MiddleOfLL {
    public static void main(String[] args) {
        Middle ll = new Middle();
        ll.addattail(10);
        ll.addattail(20);
        ll.addattail(30);
        ll.addattail(40);
        ll.addattail(50);
        ll.addattail(600);
        ll.display();
        System.out.println(ll.mid());
        System.out.println(ll.slow_fast());
        System.out.println(ll.Kth_from_end(2));
    }
}

