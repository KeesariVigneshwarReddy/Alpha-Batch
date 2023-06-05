/* 3) Size of largest BST in BT */
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
    // creating a class info
    static class Info
    {
        // properties of info class for a node
        boolean isBST;
        int size;
        int min;
        int max;
        // constructor
        public Info (boolean isBST, int size, int min, int max)
        {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    // this variable will track the size of largest BST
    public static int maxBST = 0;
    public static Info largestBST(Node root)
    {
        // base case
        if (root == null)
        {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        // recursive call for left subtree
        Info leftInfo = largestBST(root.left);
        // recursive call for right subtree
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));
        // checking the invalid conditions of BST
        if (root.data <= leftInfo.max || root.data >= rightInfo.min)
        {
            return new Info(false, size, min, max);
        }
        // when both left and right sub tree are valid BST then root note is valid BST
        if (leftInfo.isBST && rightInfo.isBST)
        {
            // updating maxBST
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
    public static void main(String[] args)
    {
        /*
            Given BT -
                    50
                   /  \
                  30   60
                 / \   / \
                5  20 45  70
                          / \
                         65  80
         */
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        /*
                         60
                        /  \
                       45   70
                           /  \
                          65   80
           Expected BST Size = 5
        */
        Info information = largestBST(root);
        System.out.println(maxBST);
    }
}
