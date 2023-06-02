/* 6) Sum of data in nodes  */
import java.util.*;
public class LQ6
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
    // recursive function to calculate sum of data in nodes
    public static int sum(Node root)
    {
        // base case
        if (root == null)
        {
            return 0;
        }
        // recursive call for left subtree
        int LS = sum(root.left);
        // recursive call for right subtree
        int RS = sum(root.right);
        // toatal sum is LS + RS + root.data(self count)
        int TS = LS + RS + root.data;
        return TS;
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
        System.out.println(sum(root));
    }
}
