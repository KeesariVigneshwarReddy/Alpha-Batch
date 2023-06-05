/* 3) Delete a node in a BST */
import java.util.*;
public class LQ3
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
    public static Node delete(Node root, int key)
    {
        // step 1 - finding node
        if (root.data < key)
        {
            root.right = delete(root.right, key);
        }
        else if (root.data > key)
        {
            root.left = delete(root.left, key);
        }
        // this else statement runs when we have found the node
        // (root.data == value)
        else
        {
            // here we would have to check 3 cases and proceed respectively
            // case 1 - deleting Leaf Node
            if (root.left == null && root.right == null)
            {
                return null;
            }
            // case 2 - deleting node with Single child
            if (root.left == null)
            {
                return root.right;
            }
            else if (root.right == null)
            {
                return root.left;
            }
            // case 3 - deleting node with two children
            // step 1 - find the In Order Successor node of current node
            Node IS = findInorderSuccessor(root.right);
            // updating the value of curr Node
            root.data = IS.data;
            // recursive call in right sub tree to delete In Order Successor node
            root.right = delete(root.right, IS.data);
        }
        // finally returning root
        return root;
    }
    public static Node findInorderSuccessor(Node root)
    {
        // in order successor is left most node of right sub tree
        while (root.left != null)
        {
            root = root.left;
        }
        return root;
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
        // inputing key which should be deleted
        int k = sc.nextInt();
        // this function deletes the key from BST
        root = delete(root, k);
        // in order traversal
        inOrder(root);
    }
}
