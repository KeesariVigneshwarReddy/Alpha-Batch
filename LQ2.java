/* 2) Print k th level
      (Recursive appoach) */
import java.util.*;
public class Main
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
    // this function prints kth level
    public static void klevel(Node root, int k, int level)
    {
        // when tree is empty
        if (root == null)
        {
            return;
        }
        // base case
        if (level == k)
        {
            System.out.print(root.data + " ");
        }
        // recursive call for left sub tree
        klevel(root.left, k, level + 1);
        // recursive call for right sub tree
        klevel(root.right, k, level + 1);
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
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int k = sc.nextInt();
        klevel(root, k, 1);
    }
}
