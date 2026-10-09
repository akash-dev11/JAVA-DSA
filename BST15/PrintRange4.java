package BST15;



public class PrintRange4 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    static void printRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        // Root chhota hai → right mein jao
        if (root.data < k1) {
            printRange(root.right, k1, k2);
        }
        // Root bada hai → left mein jao
        else if (root.data > k2) {
            printRange(root.left, k1, k2);
        }
        // Root range ke andar hai
        else {
            printRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printRange(root.right, k1, k2);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(12);
        printRange(root, 5, 10);
    }
}
