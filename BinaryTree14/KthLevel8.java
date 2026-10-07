package BinaryTree14;


public class KthLevel8 {
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
    static void kthLevel(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 1) {
            System.out.print(root.data + " ");
            return;
        }
        kthLevel(root.left, k - 1);
        kthLevel(root.right, k - 1);
    }
    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
              / \   \
             4   5   6
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        int k = 2;
        kthLevel(root, k);
    }
}
