package BST15;

public class SortedArrayToBST8 {
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
    // Sorted Array -> Balanced BST
    public static Node sortedArrayToBST(int arr[], int start, int end) {
        // Base case
        if (start > end) {
            return null;
        }
        // Middle element
        int mid = start + (end - start) / 2;
        // Middle element becomes root
        Node root = new Node(arr[mid]);
        // Left half
        root.left = sortedArrayToBST(arr, start, mid - 1);
        // Right half
        root.right = sortedArrayToBST(arr, mid + 1, end);
        return root;
    }
    // Preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        Node root = sortedArrayToBST(arr, 0, arr.length - 1);
        System.out.println("Preorder of Balanced BST:");
        preorder(root);
    }
}