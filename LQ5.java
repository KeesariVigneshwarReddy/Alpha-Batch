/* 5) Count number of nodes   */
import java.util.*;
public class LQ5
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
    // recursive function to calculate no. of nodes
    public static int countNodes(Node root)
    {
        // base case
        if (root == null)
        {
            return 0;
        }
        // recursive call for left subtree
        int LC = countNodes(root.left);
        // recursive call for right subtree
        int RC = countNodes(root.right);
        // toatal count is LC + RC + 1(self count)
        int TC = LC + RC + 1;
        return TC;
    }
    public static void main(String[] args)
    {
        /*
                     1
                    / \
                   2   3
                  / \ / \
                 4  5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(countNodes(root));
    }
}
