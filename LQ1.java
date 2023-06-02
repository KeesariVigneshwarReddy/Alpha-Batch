/* 1) Create a tree  */
import java.util.*;
public class LQ1
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
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // preorder nodes
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
