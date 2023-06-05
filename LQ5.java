/* 5) AVL tree code */
import java.util.*;
public class LQ5
{
    static class Node
    {
        int data;
        int height;
        Node left;
        Node right;
        Node (int data)
        {
            this.data = data;
            height = 1;
        }
    }
    public static Node root;
    public static int height (Node root)
    {
        if (root == null)
        {
            return 0;
        }
        return root.height;
    }
    public static int balanceFactor(Node root)
    {
        if (root == null)
        {
            return 0;
        }
        return height(root.left) - height(root.right);
    }
    public static Node leftRotate(Node x)
    {
        /*
               x                              y
                \                            /
                 y        <------>          x
                /                            \
               T2                             T2
        */
        // step 1 -> declare nodes
        Node y = x.right;
        Node T2 = y.left;
        // step 2 -> perform rotation
        y.left = x;
        x.right = T2;
        // step 3 -> update heights
        x.height = 1 + Math.max(height(x.left), height(x.right)) + 1;
        y.height = 1 + Math.max(height(y.left), height(y.right)) + 1;
        // step 4 -> return new root
        return y;
    }
    public static Node rightRotate(Node y)
    {
        /*
               y                                x
              /                                  \
             x                <--->               y
              \                                  /
               T2                               T2
        */
        // step 1 -> declare nodes
        Node x = y.left;
        Node T2 = x.right;
        // step 2 -> perform rotation
        x.right = y;
        y.left = T2;
        // step 3 -> update heights
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));
        // step 4 -> return new root
        return x;
    }
    public static Node insert(Node root, int key)
    {
        // when tree is empty
        if (root == null)
        {
            return new Node(key);
        }
        // simple BST insertion code
        if (key < root.data)
        {
            root.left = insert(root.left, key);
        }
        else if (key > root.data)
        {
            root.right = insert(root.right, key);
        }
        // root.data and key are equal then we don't insert that key since duplicate are not allowed
        else
        {
            return root;
        }
        // update root.height
        root.height = 1 + Math.max(height(root.left), height(root.right));
        // balance factor
        int bf = balanceFactor(root);
        // LL case
        if (bf > 1 && key < root.left.data)
        {
            return rightRotate(root);
        }
        // RR case
        if (bf < -1 && key > root.right.data)
        {
            return leftRotate(root);
        }
        // LR case
        if (bf > 1 && key > root.left.data)
        {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }
        // RL case
        if (bf < -1 && key < root.right.data)
        {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    public static void preOrder(Node root)
    {
        if (root == null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args)
    {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);
        /*
              Normal BST                                AVL tree
                10                                        30
                 \                                       /  \
                  20                                    20   40
                 / \                                   /  \    \
                25  30                                10  25    50
                     \
                      40
                       \
                        50
        */
        preOrder(root);
    }
}
