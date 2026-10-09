package BST15;

public class DeleteBST3 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    static Node delete(Node root, int key) {
        // Node nahi mila
        if (root == null) {
            return null;
        }
        // Left mein search
        if (key < root.data) {
            root.left = delete(root.left, key);
        }
        // Right mein search
        else if (key > root.data) {
            root.right = delete(root.right, key);
        }
        // Node mil gaya
        else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case 2: Only right child
            if (root.left == null) {
                return root.right;
            }
            // Case 2: Only left child
            if (root.right == null) {
                return root.left;
            }
            // Case 3: Two children
            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }
    // Right subtree ka smallest element
    static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    } 
    public static void main(String[] args) {

        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(12);

        System.out.println("Before deletion:");
        inorder(root);

        root = delete(root, 5);

        System.out.println("\nAfter deletion:");
        inorder(root);
    }
}
