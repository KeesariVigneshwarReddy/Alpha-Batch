/* 7) Transform to its sum tree */
import java.util.*;
public class LQ7
{
    // creating a node
    static class Node
    {
        // properties of node
        int data;
        Node left;
        Node right;
        // constructor
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // this is a function to print BT
    public static void preOrder(Node root)
    {
        if (root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    // this function transform binary tree to its sum tree
    public static int TransformSumTree(Node root)
    {
        // base case
        if (root == null)
        {
            return 0;
        }
        // kaam
        int LeftChild = TransformSumTree(root.left);
        int RightChild = TransformSumTree(root.right);
        // calculating updated left and right
        int newLeft = 0;
        int newRight = 0;
        if (root.left != null)
        {
            newLeft = root.left.data;
        }
        if (root.right != null)
        {
            newRight = root.right.data;
        }
        // storing data of root
        int data = root.data;
        // updating root.data
        root.data = newLeft + LeftChild + newRight + RightChild;
        return data;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner (System.in);
        /*
                     1
                    / \
                   2   3
                  / \ / \
                 4  5 6  7

                     27
                    / \
                   9   13
                  / \ / \
                 0  0 0  0
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        TransformSumTree(root);
        preOrder(root);
    }
}
