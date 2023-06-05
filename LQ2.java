/* 2) Calculate Diameter of a Binary tree
      (Approach 2) */
import java.util.*;
public class LQ2
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
    // this is an information class which stores data of a particular node
    static class Info
    {
        // properties
        int diameter;
        int height;
        // constructor
        public Info(int diameter, int height)
        {
            this.diameter = diameter;
            this.height = height;
        }
    }
    // this is an single function which calculates both diameter and height simultaneously
    public static Info diameter(Node root)
    {
        // base case
        if (root == null)
        {
            return new Info(0, 0);
        }
        // recursive call for left sub tree
        Info leftInfo = diameter(root.left);
        // recursive call for right sub tree
        Info rightInfo = diameter(root.right);
        // this is diameter of a particular node
        int diameter = Math.max(leftInfo.height + rightInfo.height + 1, Math.max(leftInfo.diameter, rightInfo.diameter));
        // this is height of a particular node
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        // returning the complete info of a node
        return new Info(diameter, height);
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
        System.out.println(diameter(root).diameter);
        System.out.println(diameter(root).height);
    }
}
