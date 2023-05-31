/* 2) Implement a stack using Linked List */
import java.util.*;
public class LQ2
{
    // creating node of LL
    static class Node
    {
        // properties
        int data;
        Node next;
        // constructor
        Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    // creating a stack using array list
    static class Stack
    {
        static Node head = null;
        // checking whether stack is empty or not
        public static boolean isEmpty()
        {
            return head == null;
        }
        // push function
        public static void push (int data)
        {
            Node newNode = new Node (data);
            if (isEmpty())
            {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        // pop function
        public static int pop()
        {
            if (isEmpty())
            {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        // peek function
        public static int peek()
        {
            if (isEmpty())
            {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args)
    {
        // creating stack
        Stack s = new Stack();
        // pushing data
        s.push(1);
        s.push(2);
        s.push(3);
        // printing and popping
        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
