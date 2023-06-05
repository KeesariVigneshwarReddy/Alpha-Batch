/* 1) Calculate Diameter of a Binary tree  
      (Approach 1)*/
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
    // recursive function to calculate height of tree
    public static int height(Node root)
    {
        // base case
        if (root == null)
        {
            return 0;
        }
        // recursive call for left subtree
        int LH = height(root.left);
        // recursive call for right subtree
        int RH = height(root.right);
        // calculate max of left subtree and right subtree
        int MH = Math.max(LH, RH);
        return MH + 1;
    }
    // a recursive function to calculate diameter of tree
    public static int diameter(Node root)
    {
        // base case
        if (root == null)
        {
            return 0;
        }
        // left subtree diameter
        int LDM = diameter(root.left);
        // left subtree height
        int LH = height(root.left);
        // right subtree diameter
        int RDM = diameter(root.right);
        // right subtree height
        int RH = height(root.left);
        // diameter when we include root also
        int selfDM = LH + RH + 1;
        // actual diameter is max of selfDM, LDM, RDM
        int ActualDM = Math.max(selfDM, Math.max(LDM, RDM));
        return ActualDM;
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
        System.out.println(diameter(root));
    }
}
