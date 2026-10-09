package BST15;

public class ValidateBST6 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    static boolean isValidBST(Node root, long min, long max) {
        if (root == null) {
            return true;
        }
        // Range ke bahar hai
        if (root.data <= min || root.data >= max) {
            return false;
        }
        // Left: min same, max = root.data
        // Right: min = root.data, max same
        return isValidBST(root.left, min, root.data) && isValidBST(root.right, root.data, max);
    }

    public static void main(String[] args) {

        Node root = new Node(8);

        root.left = new Node(5);
        root.right = new Node(10);

        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right.right = new Node(12);

        if (isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE)) {
            System.out.println("Valid BST");
        } else {
            System.out.println("Invalid BST");
        }
    }
}
