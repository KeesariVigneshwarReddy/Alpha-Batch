/* 3) Subtree of another tree
      Given the roots of two binary trees root and subroot, return true if
      there is a subtree of root with same structure and nodes values of subroot
      and false otherwise */
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
        Node (int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean isIdentical(Node node, Node subRoot)
    {
        // when both are null then we return true
        if (node == null && subRoot == null)
        {
            return true;
        }
        // we are checking for the conditions when both are non identical
        // when data mismatches or any one is null then we return false
        else if(node == null || subRoot == null || node.data != subRoot.data)
        {
            return false;
        }
        // when left subtree is non identical
        if (!isIdentical(node.left, subRoot.left))
        {
            return  false;
        }
        // when right subtree is non identical
        if (!isIdentical(node.right, subRoot.right))
        {
            return false;
        }
        // if we get false no where in above tests then both are identical
        return true;
    }
    // this function checks whether the subtree exists in original tree or not
    public static boolean isSubTree(Node root, Node subRoot)
    {
        // when tree is empty
        if (root == null)
        {
            return false;
        }
        // base case
        if (root.data == subRoot.data)
        {
            // when data is same then it goes to isIdentical function
            if(isIdentical(root, subRoot))
            {
                return true;
            }
        }
        // recursive call for left subtree of main tree
        boolean isLeft = isSubTree(root.left, subRoot);
        // recursive call for right subtree of main tree
        boolean isRight = isSubTree(root.right, subRoot);
        // if any one thing gets true then subtree exists in original tree
        return isLeft || isRight;
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
        /*
                      2
                     / \
                    4   5
        */
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        if(isSubTree(root, subRoot))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
