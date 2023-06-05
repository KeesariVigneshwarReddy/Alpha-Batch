/* 1) Search in BST */
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
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean BSTSearch(Node root, int key)
    {
        if (root.data == key)
        {
            return true;
        }
        else if (root.data > key)
        {
            return BSTSearch(root.left, key);
        }
        else if (root.data < key)
        {
            return BSTSearch(root.right, key);
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        /*
                     4
                    / \
                   2   5
                  / \   \
                 1  3    6
         */
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);
        int key = sc.nextInt();
        if (BSTSearch(root, key))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
    }
}
