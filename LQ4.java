/* 4) Print in a range */
import java.util.*;
public class LQ4
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
        if (root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public static void printInRange(Node root, int k1, int k2)
    {
        if (root == null)
        {
            return;
        }
        if (root.data >= k1 && root.data <= k2)
        {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if (root.data < k1)
        {
            printInRange(root.left, k1, k2);
        }
        else
        {
            printInRange(root.right, k1, k2);
        }
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
        // in order traversal
        inOrder(root);
        System.out.println();
        printInRange(root, 5, 12);
    }
}
