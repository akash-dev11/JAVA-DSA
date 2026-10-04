package Hashmap12;

class MyHashMap {

    // Node = Key + Value
    class Node {
        int key;
        int value;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    Node[] table;
    int size;
    // Constructor
    MyHashMap(int size) {
        this.size = size;
        table = new Node[size];
    }

    // Hash Function
    int hashFunction(int key) {
        return key % size;
    }

    // Put
    void put(int key, int value) {
        int index = hashFunction(key);
        // If bucket is empty
        if (table[index] == null) {
            table[index] = new Node(key, value);
            return;
        }
        // Search in linked list
        Node temp = table[index];
        while (temp != null) {
            // Key already exists
            if (temp.key == key) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        // Add new node at beginning
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    // Get
    int get(int key) {
        int index = hashFunction(key);
        Node temp = table[index];
        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }
        return -1;
    }

    // Remove
    void remove(int key) {
        int index = hashFunction(key);
        Node temp = table[index];
        Node prev = null;
        while (temp != null) {
            if (temp.key == key) {
                // First node
                if (prev == null) {
                    table[index] = temp.next;
                } 
                // Middle/last node
                else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    // Display
    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(i + " → ");
            Node temp = table[i];
            while (temp != null) {
                System.out.print(
                    "(" + temp.key + ", " + temp.value + ") → "
                );
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
}
public class HashMapImplementation {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap(5);
        map.put(10, 100);
        map.put(15, 200);
        map.put(7, 300);
        map.put(12, 400);
        map.display();
        System.out.println("Value of 15: " + map.get(15));
        map.remove(15);
        System.out.println("After removing 15:");
        map.display();
    }
}
