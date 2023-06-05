/* 6) Validate BST
      (Method 1) */
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
    // this function builds a BST
    public static Node insert(Node root, int value)
    {
        // base case
        if (root == null)
        {
            root = new Node(value);
            return root;
        }
        // left subtree insert (recursive call)
        if (root.data > value)
        {
            root.left = insert(root.left, value);
        }
        // right subtree insert (recursive call)
        else
        {
            root.right = insert(root.right, value);
        }
        return root;
    }
    public static void inOrder(Node root, ArrayList<Integer> IOT)
    {
        // we perform inorder traversal of a BST and add root.data to a arraylist
        if (root == null)
        {
            return;
        }
        inOrder(root.left, IOT);
        IOT.add(root.data);
        inOrder(root.right, IOT);
    }
    // this function checks whether array list is sorted or not
    public static boolean isSorted(ArrayList<Integer> IOT)
    {
        for (int i = 0; i < IOT.size(); i++)
        {
            for (int j = i + 1; j < IOT.size(); j++)
            {
                if (IOT.get(i) > IOT.get(j))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        // inputing no. of nodes and values array
        int n = sc.nextInt();
        int values[] = new int[n];
        for (int i = 0; i < values.length; i++)
        {
            values[i] = sc.nextInt();
        }
        // building the BST
        Node root = null;
        for (int i = 0; i < values.length; i++)
        {
            root = insert (root, values[i]);
        }
        ArrayList<Integer> IOT = new ArrayList<>();
        // we are using the  basic property that a Inorder traversal of a BST is sorted increasingly
        inOrder(root, IOT);
        // this function checks whether array list is sorted or not
        if(isSorted(IOT))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
