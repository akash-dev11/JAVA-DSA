package Queues11;

class Queue {
    int[] arr;
    int front = 0;
    int rear = 0;
    int size = 0;
    Queue(int n) {
        arr = new int[n];
    }
    // Add
    void add(int data) {
        if (size == arr.length) {
            System.out.println("Queue is full");
            return;
        }
        arr[rear] = data;
        rear = (rear + 1) % arr.length;
        size++;
    }
    // Remove
    int remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return data;
    }

    // peek
    int peek() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % arr.length] + " ");
        }
        System.out.println();
    }
}

public class ArrayImplementation {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.remove();
        q.add(60);
        q.add(70);
        q.display();
    }
}