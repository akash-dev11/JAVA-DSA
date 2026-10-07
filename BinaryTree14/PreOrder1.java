package BinaryTree14;

import java.util.LinkedList;
import java.util.Queue;

public class PreOrder1 {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root == null){
            // System.out.print(-1+" ");
            return ;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

     public static void inorder(Node root){
        if(root == null){
            // System.out.print(-1+" ");
            return ;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
    public static void postOrder(Node root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void LevelOrder(Node root){
        if(root == null){
            return ;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node newNode  = q.remove();
            if(newNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(newNode.data+" ");
                if(newNode.left != null){
                    q.add(newNode.left);
                }
                if(newNode.right != null){
                    q.add(newNode.right);
                }
            }
        }

    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        preorder(root);
        System.out.println();

        inorder(root);
        System.out.println();
        
        postOrder(root);
        System.out.println();

        LevelOrder(root);

    }

}
