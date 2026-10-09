package BST15;

public class Search2 {

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // Search in BST
    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        /*
                8
               / \
              5   10
             / \    \
            3   6    12
        */
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(12);
        int key = 6;

        if (search(root, key)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}