/* 1) Sorted array to a Balanced BST */
import java.util.*;
public class LQ1
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
    // this function creates a balanced BST
    public static Node createBalanceBST(int arr[], int start, int end)
    {
        // this is an invalid case and thus our base case
        if (start > end)
        {
            return null;
        }
        // calculate mid
        int mid = (start + end) / 2;
        // let mid of array be root
        Node root = new Node(arr[mid]);
        // recursive call for left sub tree
        root.left = createBalanceBST(arr, start, mid - 1);
        // recursive call for right sub tree
        root.right = createBalanceBST(arr, mid + 1, end);
        return root;
    }
    public static void main(String[] args)
    {
        int arr[] = {3, 5, 6, 8, 10, 11, 12};
        /*
                        8
                       / \
                      5   11
                     / \  / \
                    3  6 10 12
        */
        inOrder(createBalanceBST(arr, 0, arr.length - 1));
    }
}
