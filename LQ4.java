/* 4) Lowest common ancestor
      (Method 2) */
import java.util.*;
public class LQ4
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
        // this function returns the LCA node
        Node LCA = LeastCommonAncestor(root, n1, n2);
        // printing data
        System.out.print(LCA.data);
    }
}
