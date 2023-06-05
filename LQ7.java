/* 7) Validate BST
      (Method 2) */
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
    // this function builds a BST
    public static Node insert(Node root, int value)
    {
        // base case
        if (root == null)
        {
            root = new Node(value);
            return root;
        }
        // left subtree insert (recursive call)
        if (root.data > value)
        {
            root.left = insert(root.left, value);
        }
        // right subtree insert (recursive call)
        else
        {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public static void inOrder(Node root)
    {
        // we perform inorder traversal of a BST and add root.data to a arraylist
        if (root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    // this function checks whether a BST is valid or not
    public static boolean isValidBST(Node root, Node min, Node max)
    {
        // base case
        if (root == null)
        {
            return true;
        }
        // whenever the min max rule is broken for a node
        if (min != null && root.data <= min.data)
        {
            return false;
        }
        else if (max != null && root.data >= max.data)
        {
            return false;
        }
        // recursive call for left subtree
        boolean leftValidity = isValidBST(root.left, min , root);
        // recursive call for right subtree
        boolean rightValidity = isValidBST(root.right, root , max);
        // overall BST is valid when both left sub tree and right sub tree are valid
        return leftValidity && rightValidity;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        // inputing no. of nodes and values array
        int n = sc.nextInt();
        int values[] = new int[n];
        for (int i = 0; i < values.length; i++)
        {
            values[i] = sc.nextInt();
        }
        // building the BST
        Node root = null;
        for (int i = 0; i < values.length; i++)
        {
            root = insert (root, values[i]);
        }
        inOrder(root);
        System.out.println();
        if(isValidBST(root, null, null))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
