/* 3) Create a tree
      perform level order traversal   */
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
    // creating a binary tree
    static class BinaryTree
    {
        // lets initialize index with -1
        static int idx = -1;
        // this is a recursive function which creates nodes in binary tree
        public static Node buildTree(int nodes[])
        {
            idx++;
            if (nodes[idx] == -1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            // first we make left
            newNode.left = buildTree(nodes);
            // then we make right
            newNode.right = buildTree(nodes);
            return newNode;
        }
        // for this type of traversal we use iterative approach and queue
        public static void levelOrder(Node root)
        {
            // when tree is empty
            if (root == null)
            {
                return;
            }
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
                    System.out.println();
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
                    System.out.print(currNode.data + " ");
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
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // preorder nodes
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelOrder(root);
    }
}
