/* 2) Create a tree
      Depth First Search (DFS)
      a) perform pre order traversal
      b) perform in order traversal
      c) perform post order traversal    */
import java.util.*;
public class LQ2
{
    // creating a node
    static class Node
    {
        // properties of node
        int data;
        Node left;
        Node right;
        // constructor
        Node (int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // creating a binary tree
    static class BinaryTree
    {
        // lets initialize index with -1
        static int idx = -1;
        // this is a recursive function which creates nodes in binary tree
        public static Node buildTree(int nodes[])
        {
            idx++;
            if (nodes[idx] == -1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            // first we make left
            newNode.left = buildTree(nodes);
            // then we make right
            newNode.right = buildTree(nodes);
            return newNode;
        }
        // this is a recursive function which traverse through nodes (pre Order) in binary tree
        public static void preOrder(Node root)
        {
            if (root == null)
            {
                return;
            }
            System.out.print(root.data + " ");
            // recursive call for left sub tree
            preOrder(root.left);
            // recursive call for right sub tree
            preOrder(root.right);
        }
        // this is a recursive function which traverse through nodes (in Order) in binary tree
        public static void inOrder(Node root)
        {
            if (root == null)
            {
                return;
            }
            // recursive call for left sub tree
            inOrder(root.left);
            System.out.print(root.data + " ");
            // recursive call for right sub tree
            inOrder(root.right);
        }
        // this is a recursive function which traverse through nodes (post Order) in binary tree
        public static void postOrder(Node root)
        {
            if (root == null)
            {
                return;
            }
            // recursive call for left sub tree
            postOrder(root.left);
            // recursive call for right sub tree
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // preorder nodes
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.preOrder(root);
        System.out.println();
        tree.inOrder(root);
        System.out.println();
        tree.postOrder(root);
    }
}
