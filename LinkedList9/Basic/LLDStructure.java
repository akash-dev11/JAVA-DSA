package Basic;

class Node1{
    int value;
    Node1 next;
    Node1(int value){
        this.value = value;
    }
}
class Linkedlist {  // user defined data structure
    Node1 head;  // null
    Node1 tail;  // null
    int size;

    int Search(int val){
        Node1 tem = head;
        if(tem==null){
            return -1;
        }
        int inx = 0;
        while(tem!=null){
            if(tem.value == val){
                return inx;
            }
            tem = tem.next;
            inx++;
        }
        return -1;
    }

    void deletehead(){
        if(head==null){
            System.out.println("linkedlist is empty");
            return;
        }
        head = head.next;
        size--;
    }

    void addAtHead(int val){
        Node1 temp = new Node1(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void addAtTail(int val){
        Node1 temp = new Node1(val);
        if(tail==null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void display(){
        if(head==null){
            return;
        }
        Node1 temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LLDStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.display();
        ll.addAtHead(60);
        ll.display();
        ll.deletehead();
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.Search(30));

        
    }
}
