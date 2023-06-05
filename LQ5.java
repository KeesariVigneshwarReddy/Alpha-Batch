/* 5) Minimum distance between 2 nodes */
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

    // this function returns the LCA node for n1 and n2
    public static Node LeastCommonAncestor(Node root, int n1, int n2)
    {
        if ( root == null || root.data == n1 || root.data == n2)
        {
            return root;
        }
        Node leftLCA = LeastCommonAncestor(root.left, n1, n2);
        Node rightLCA = LeastCommonAncestor(root.right, n1, n2);
        // this implies neither n1 nor n2 exists in right subtree
        if (rightLCA == null)
        {
            return leftLCA;
        }
        // this implies neither n1 nor n2 exists in left subtree
        if (leftLCA == null)
        {
            return rightLCA;
        }
        // this implies n1 exists and n2 exists two different subtrees
        return root;
    }
    // this function calculates distance from LCA to node n
    public static int LCADist(Node root, int n)
    {
        // when root is null no distance exists
        if (root == null)
        {
            return -1;
        }
        // base case
        if (root.data == n)
        {
            return 0;
        }
        // recursive call for left subtree
        int leftDist = LCADist(root.left, n);
        // recursive call for right subtree
        int rightDist = LCADist(root.right, n);
        // when node n do not exist in subtree
        if (leftDist == -1 && rightDist == -1)
        {
            return -1;
        }
        // when leftdist is invalid and right is valid
        else if(leftDist == -1)
        {
            return rightDist + 1;
        }
        // when rightdist is invalid and left is valid
        else if(rightDist == -1)
        {
            return leftDist + 1;
        }
        return 0;
    }
    // this function calculates min distances between n1 and n2
    public static int minDist(Node root, int n1, int n2)
    {
        // first task is to find LCA
        Node LCA = LeastCommonAncestor(root, n1, n2);
        // calculating distance from LCA to n1
        int dist1 = LCADist(LCA, n1);
        // calculating distance from LCA to n2
        int dist2 = LCADist(LCA, n2);
        return dist1 + dist2;
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
        // inputing nodes
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(minDist(root, n1, n2));
    }
}
