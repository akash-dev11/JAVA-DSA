package BST15;

import java.util.ArrayList;
public class RootToLeaf5 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    static void rootToLeaf(Node root, ArrayList<Integer> path) {
        // Base case
        if (root == null) {
            return;
        }
        // Current node ko path mein add karo
        path.add(root.data);
        // Leaf node mil gaya
        if (root.left == null && root.right == null) {
            System.out.println(path);
        } else {
            // Left subtree
            rootToLeaf(root.left, path);
            // Right subtree
            rootToLeaf(root.right, path);
        }
        // Backtracking
        path.remove(path.size() - 1);
    }
    public static void main(String[] args) {
        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(12);

        ArrayList<Integer> path = new ArrayList<>();

        rootToLeaf(root, path);
    }
}