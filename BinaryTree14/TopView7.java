package BinaryTree14;


import java.util.*;
public class TopView7 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    static class Info {
        Node node;
        int hd;
        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    static void topView(Node root) {
        if (root == null) {
            return;
        }
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        q.add(new Info(root, 0));
        while (!q.isEmpty()) {
            Info curr = q.remove();
            // First node at this horizontal distance
            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node.data);
            }
            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
            }
            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
            }
        }
        // Print from left to right
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        for (int key : keys) {
            System.out.print(map.get(key) + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.right = new Node(6);

        topView(root);
    }
}