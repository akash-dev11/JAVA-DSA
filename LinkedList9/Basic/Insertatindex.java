package Basic;
class insert{
    Node head;
    Node tail;
    int size;
    void addatIndex(int val, int ind){
        if(ind<0 || ind>size){
            System.out.println("Invalid index");
            return;
        }
        if(ind==0){
            addhead(val);
        }
        else if(ind==size){
            addtail(val);
        }
        else{
            Node temp = head;
            for(int i=0; i<ind-1; i++){
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    void addhead(int val){
        Node temp = new Node(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void addtail(int val){
        Node temp = new Node(val);
        if(tail== null){
            head=tail=temp;
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
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
        
    }

    void deletehead(){
        if(head==null){
            System.out.println("linkedlist is empty");
            return;
        }
        head = head.next;
        size--;
    }

    void delete(int idx){
        if(idx<0 || idx>size){
            System.out.println("Invalid index");
            return;
        }
        if(idx==0){
            deletehead();
            return;
        }
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp= temp.next;
        }
        temp.next = temp.next.next;
        if(idx==size-1){
            tail = temp;
        }
        size--;
    }

    int get(int ind){
        Node temp = head;
        for(int i=0; i<ind; i++){
            temp = temp.next;
        }
        return temp.value;
    }
}
public class Insertatindex {
    public static void main(String[] args) {
        insert add = new insert();
        add.addtail(10);
        add.addtail(20);
        add.addtail(30);
        add.display();
        add.addhead(40);
        add.display();
        add.addatIndex(50,2);
        add.display();
        System.out.println(add.get(3));
        add.delete(2);
        add.display();

        
    }
}
