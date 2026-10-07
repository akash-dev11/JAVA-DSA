package BinaryTree14;

import java.util.*;
public class LowestCommonAns9I {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        if (getPath(root.left, n, path) ||
            getPath(root.right, n, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i = 0;
        while (i < path1.size() && i < path2.size() && path1.get(i) == path2.get(i)) {

            i++;
        }
        return path1.get(i - 1);
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
