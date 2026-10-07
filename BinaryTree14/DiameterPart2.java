package BinaryTree14;


public class DiameterPart2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    static int diameter = 0;
    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        // diameter through current node
        diameter = Math.max(diameter, leftHeight + rightHeight + 1);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.left.left = new Node(6);

        height(root);

        System.out.println("Diameter = " + diameter);
    }
}
