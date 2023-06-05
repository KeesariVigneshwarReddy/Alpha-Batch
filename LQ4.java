/* 4) Top view of a binary tree */
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
        Node (int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    // this class stores node and horizontal distance
    static class Info
    {
        // Properties
        Node node;
        int HD;
        // constructor
        public Info(Node node, int HD)
        {
            this.node = node;
            this.HD = HD;
        }
    }
    public static void topView(Node root)
    {
        // level order traversal
        // the queue stores information of nodes
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        // this is min and max HD
        int min = 0;
        int max = 0;
        q.add(new Info(root, 0));
        q.add(null);
        while (!q.isEmpty())
        {
            // the simple conditions which we check in level order traversal
            Info curr = q.remove();
            if (curr == null)
            {
                if (q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            // when curr is not null
            else
            {
                // when HD is occuring for the time
                if (!map.containsKey(curr.HD))
                {
                    map.put(curr.HD, curr.node);
                }
                // for left child
                if (curr.node.left != null)
                {
                    // adding in queue
                    // HD(left) = HD(curr) - 1
                    q.add(new Info(curr.node.left, curr.HD - 1));
                    // updating min HD
                    min = Math.min(min, curr.HD - 1);
                }
                // for right child
                if (curr.node.right != null)
                {
                    // adding in queue
                    // HD(right) = HD(curr) + 1
                    q.add(new Info(curr.node.right, curr.HD + 1));
                    // updating max HD
                    max = Math.max(max, curr.HD + 1);
                }
            }
        }
        for (int i = min; i <= max; i++)
        {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
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
        topView(root);
    }
}
