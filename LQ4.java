/* 4) Merge 2 BST */
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
    // this function is for printing in inorder traversal
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
    // this function merges SAL1 and SAL2 to FSAL
    public static void merge(ArrayList<Integer> SAL1, ArrayList<Integer> SAL2, ArrayList<Integer> FSAL)
    {
        int i = 0, j = 0;
        while (i < SAL1.size() && j < SAL2.size())
        {
            if (SAL1.get(i) < SAL2.get(j))
            {
                FSAL.add(SAL1.get(i++));
            }
            else
            {
                FSAL.add(SAL2.get(j++));
            }
        }
        while (i < SAL1.size())
        {
            FSAL.add(SAL1.get(i++));
        }
        while (j < SAL1.size())
        {
            FSAL.add(SAL2.get(j++));
        }
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
            Given BT 1 -
                    2
                   / \
                  1   4
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
        /*
             Given BT 2 -
                    9
                   / \
                  3   12
        */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        /*
                    3
                  /   \
                 1     9
                  \   / \
                   2 4   12
        */
        // sorted AL for root1
        ArrayList<Integer> SAL1 = new ArrayList<>();
        // sorted AL for root2
        ArrayList<Integer> SAL2 = new ArrayList<>();
        // this function traverses in inorder fashion and adds node data to AL
        inOrderArray(root1, SAL1);
        inOrderArray(root2, SAL2);
        // final sorted AL is formed by merging SAL1 and SAL2
        ArrayList<Integer> FSAL = new ArrayList<>();
        // this function merges SAL1 and SAL2 to FSAL
        merge(SAL1, SAL2, FSAL);
        // creating a balanced BST of FSAL
        inOrder(createBalanceBST(FSAL, 0, FSAL.size() - 1));
    }
}
