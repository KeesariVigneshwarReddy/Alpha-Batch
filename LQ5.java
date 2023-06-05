/* 5) Print all paths from root to leaf */
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
    // this function print from root to leaf 
    public static void printRootToLeaf(Node root, ArrayList<Integer> path)
    {
        // base case
        if (root == null)
        {
            return;
        }
        // add root.data to path
        path.add(root.data);
        // when we are at the end of tree then we print the path
        if (root.left == null && root.right == null)
        {
            System.out.println(path);
        }
        // recursive call for left subtree
        printRootToLeaf(root.left, path);
        // recursive call for right subtree
        printRootToLeaf(root.right, path);
        // removing last elements after recursive calls
        path.remove(path.size() - 1);
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
        ArrayList<Integer> path = new ArrayList<>();
        printRootToLeaf(root, path);
    }
}
