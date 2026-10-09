package BST15;

public class LargestBST10 {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    public static class Info {
        boolean isBST;
        int size;
        int min;
        int max;
        Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    static int maxBST = 0;
    public static Info largestBST(Node root) {
        // Empty tree is BST
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info left = largestBST(root.left);
        Info right = largestBST(root.right);
        // Check whether current tree is BST
        if (left.isBST &&
            right.isBST &&
            root.data > left.max &&
            root.data < right.min) {
            int size = left.size + right.size + 1;
            maxBST = Math.max(maxBST, size);
            int min = Math.min(root.data, left.min);
            int max = Math.max(root.data, right.max);
            return new Info(true, size, min, max);
        }
        // Current tree is NOT BST
        return new Info(false, 0, 0, 0);
    }
    public static void main(String[] args) {
        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(60);

        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right.left = new Node(45);
        root.right.right = new Node(70);

        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largestBST(root);

        System.out.println("Largest BST size = " + maxBST);
    }
}
