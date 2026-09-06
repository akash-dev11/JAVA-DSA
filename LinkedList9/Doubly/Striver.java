package Doubly;
class Node1{
    int data;
    Node1 next;
    Node1 back;
    Node1(int data){
        this.data = data;
    }
}
public class Striver {
    public static Node1 ConverArrDLL(int arr[]){
        if(arr.length == 0){
            return null;
        }
        Node1 head = new Node1(arr[0]);
        Node1 temp = head;
        for(int i=1; i<arr.length; i++){
            Node1 newNode = new Node1(arr[i]);
            temp.next = newNode;
            newNode.back = temp;
            temp = newNode;
        }
        return head;
    }

    public static void print(Node1 head){
        Node1 temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node1 deleteHead(Node1 head){
        if(head == null || head.next == null){
            return  null;
        }
        Node1 temp = head;
        temp = temp.next;
        temp.back = null;
        return temp;
    }

    public static Node1 deleteTail(Node1 head){
        if(head == null || head.next == null){
            return null;
        }
        Node1 temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.back.next = null;
        return  head;
    }

    public static Node1 deleteKth(Node1 head,int k){
        if(head == null){
            return null;
        }
        Node1 temp = head;
        int count = 0;
        while(temp != null){
            if(count == k){
                break;
            }
            count++;
            temp = temp.next;
        }
        // k invalid
        if(temp == null){
            return  head;
        }
        // tail
        if(temp.next == null){
            return deleteTail(head);
        }
        // head
        if(temp == head){
            return deleteHead(head);
        }
        temp.back.next = temp.next;
        temp.next.back = temp.back;
        return head;
    }

    public  static  Node1 InsertHead(Node1 head,int value){
        Node1 newNode = new  Node1(value);
        newNode.next = head;
        return newNode;
    }

    public static Node1 InsertTail(Node1 head,int value){
        Node1 newNode = new Node1(value);
        Node1 temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        return head;
    }

    public static Node1 InsertkthPos(Node1 head,int value, int idx){
        Node1 newNode = new Node1(value);
        if(idx==0){
            return InsertHead(head, value);
        }

        Node1 temp = head;
        int count = 0;
        while(temp != null){
            if(idx == count){
                break;
            }
            count++;
            temp = temp.next;
        }
        
        newNode.back = temp.back;
        temp.back.next = newNode;

        newNode.next = temp;
        temp.back = newNode;
        return  head;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        Node1 head = ConverArrDLL(arr);
        // head = deleteHead(head);
        // head = deleteTail(head);
        // head = deleteKth(head,2);
        // head = InsertHead(head, 12);
        // head = InsertTail(head, 0);
        head = InsertkthPos(head,8,4);
        print(head);


    }
}
