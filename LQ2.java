/* 2) BST to a balnced BST */
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
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inOrder(Node root)
    {
        if (root == null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    // this function perform inOrder traversal and add all nodes data in to AL
    public static void inOrderArray(Node root, ArrayList<Integer> sortedArray)
    {
        if (root == null)
        {
            return;
        }
        inOrderArray(root.left, sortedArray);
        sortedArray.add(root.data);
        inOrderArray(root.right, sortedArray);
    }
    // this function creates a balanced BST
    public static Node createBalanceBST(ArrayList<Integer> AL, int start, int end)
    {
        // this is an invalid case and thus our base case
        if (start > end)
        {
            return null;
        }
        // calculate mid
        int mid = (start + end) / 2;
        // let mid of array be root
        Node root = new Node(AL.get(mid));
        // recursive call for left sub tree
        root.left = createBalanceBST(AL, start, mid - 1);
        // recursive call for right sub tree
        root.right = createBalanceBST(AL, mid + 1, end);
        return root;
    }
    public static void main(String[] args)
    {
        /*
                     8
                    / \
                   6   10
                  /     \
                 5       11
                /         \
               3           12
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        /* Expected -
                        8
                       / \
                      5   11
                     / \  / \
                    3  6 10 12
        */
        // applying the same logic of previous question
        ArrayList<Integer> sortedArray = new ArrayList<>();
        // we perform inorder traversal and store data of nodes in AL
        inOrderArray(root, sortedArray);
        // we create a balanced BST and print in in order fashion
        inOrder(createBalanceBST(sortedArray, 0, sortedArray.size() - 1));
    }
}
