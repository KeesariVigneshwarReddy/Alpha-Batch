/* 6) K th ancestor of node n  */
import java.util.*;
public class LQ6
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
    // this function prints data of kth ancestor of node n
    public static int KAncestor (Node root, int n, int k)
    {
        // base case
        if (root == null)
        {
            return -1;
        }
        // when root data is n
        if (root.data == n)
        {
            return 0;
        }
        // recursive call for left subtree
        int leftDist = KAncestor(root.left, n, k);
        // recursive call for right subtree
        int rightDist = KAncestor(root.right, n, k);
        // when both return -1 that means the node n do not exist at that root
        if (leftDist == -1 && rightDist == -1)
        {
            return -1;
        }
        // otherwise calculate max of LD and RD
        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k)
        {
            System.out.println(root.data);
        }
        return max + 1;
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
        KAncestor(root, 4, 1);
    }
}
