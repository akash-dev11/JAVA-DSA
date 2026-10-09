package BST15;

import java.util.ArrayList;

public class BalanceBST9 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    // Step 1: BST ka inorder -> sorted ArrayList
    static void inorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
    // Step 2: Sorted list -> Balanced BST
    static Node createBST(ArrayList<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, start, mid - 1);
        root.right = createBST(list, mid + 1, end);
        return root;
    }

    // Step 3: Convert BST to Balanced BST
    static Node balanceBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);
        return createBST(list, 0, list.size() - 1);
    }

    // Print preorder
    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        // Unbalanced BST
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.right = new Node(3);
        root.right.right.right = new Node(4);
        root.right.right.right.right = new Node(5);

        System.out.println("Before balancing:");
        preorder(root);

        root = balanceBST(root);

        System.out.println("\nAfter balancing:");
        preorder(root);
    }
}