package BinaryTree14;

public class LowestCommonAns9II {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }

    static Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);
        if (leftLCA != null && rightLCA != null) {
            return root;
        }
        if (leftLCA != null) {
            return leftLCA;
        }
        return rightLCA;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node ans = lca(root, 4, 5);

        System.out.println("LCA = " + ans.data);
    }
}