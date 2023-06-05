/* 1) Print k th level 
      (Iterative approach) */
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
    // for this type of traversal we use iterative approach and queue
    public static void klevel(Node root, int k)
    {
        // when tree is empty
        if (root == null)
        {
            return;
        }
        // this count keeps track on which level we are traversing
        int count = 1;
        // creating a queue which stores Node type data
        Queue<Node> q = new LinkedList<>();
        // lets add root and null
        // we are adding null because we have jump to another line as soon as a level is ended
        q.add(root);
        q.add(null);
        while (!q.isEmpty())
        {
            Node currNode = q.remove();
            // when currNode is null simply jump to next line
            if (currNode == null)
            {
                // since we are jumping to next line we increase value of count
                count++;
                if (q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                // print data of node only when count == k
                if (count == k)
                {
                    System.out.print(currNode.data + " ");
                }
                if (currNode.left != null)
                {
                    q.add(currNode.left);
                }
                if (currNode.right != null)
                {
                    q.add(currNode.right);
                }
            }
        }
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
        int k = sc.nextInt();
        klevel(root, k);
    }
}
