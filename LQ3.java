/* 3) Implement a queue using Linked list */
import java.util.*;
public class LQ3
{
    // we have created a node
    static class Node
    {
        int data;
        Node next;
        Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    // we created a class Queue
    static class Queue
    {
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty()
        {
            return head == null && tail == null;
        }
        public static void add(int data)
        {
            Node newNode = new Node(data);
            // when we are inserting the first node
            if (head == null)
            {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove()
        {
            if (isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            // when there is single element in LL
            if (tail == head)
            {
                head = tail = null;
            }
            else
            {
                head = head.next;
            }
            return front;
        }
        public static int peek()
        {
            if (isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args)
    {
        // a queue is made of size 3
        Queue q = new Queue();
        // adding elements
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty())
        {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
