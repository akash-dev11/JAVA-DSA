package BinaryTree14;

public class Diameter5 {
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
    // Height of tree
    static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    // Diameter - O(n^2)
    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        // Diameter of left subtree
        int leftDiameter = diameter(root.left);
        // Diameter of right subtree
        int rightDiameter = diameter(root.right);
        // Diameter passing through current root
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int selfDiameter = leftHeight + rightHeight + 1;
        return Math.max(selfDiameter,Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {
        /*
                 1
                / \
               2   3
              / \
             4   5
            /
           6
        */

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.left.left = new Node(6);

        System.out.println("Diameter = " + diameter(root));
    }
}
