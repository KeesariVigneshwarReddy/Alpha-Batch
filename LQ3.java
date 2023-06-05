/* 3) Lowest common ancestor
      (Method 1) */
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
    // this function tracks the path from root to n
    public static boolean getPath(Node root, int n, ArrayList<Node> path)
    {
        // base case
        if (root == null)
        {
            return false;
        }
        // we must add root
        path.add(root);
        // most basic case
        if (root.data == n)
        {
            return true;
        }
        // recursive call for left sub tree
        boolean foundLeft = getPath(root.left, n, path);
        // recursive call for right sub tree
        boolean foundRight = getPath(root.right, n, path);
        // when we find node at any of subtree return true
        if (foundLeft || foundRight)
        {
            return true;
        }
        // otherwise the last node and return false
        path.remove(path.size() - 1);
        return false;
    }
    // this function returns the LCA node for n1 and n2
    public static Node LCA(Node root, int n1, int n2)
    {
        // we are making arraylist for keeping a track on paths
        // from root to n1
        ArrayList<Node> path1 = new ArrayList<>();
        // from root to n2
        ArrayList<Node> path2 = new ArrayList<>();
        // with these functions we get paths
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        // with the help of this for loop we will get the last common value from both the paths
        // a pointer
        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++)
        {
            // when both data at path 1, 2 are unequal break
            if (path1.get(i) != path2.get(i))
            {
                break;
            }
        }
        Node LCA = path1.get(i - 1);
        // Alternative statement Node LCA = path2.get(i - 1);
        return LCA;
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
        Node LCA = LCA(root, n1, n2);
        // printing data
        System.out.print(LCA.data);
    }
}
