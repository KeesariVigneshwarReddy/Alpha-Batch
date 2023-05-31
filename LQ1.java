/* 1) Detect a loop or cycle in LL 
      (floyd's cycle finding algorithm) */
import java.util.*;
class LinkedList
{
    // this class contains properties of a node in LL
    public static class Node
    {
        // properties
        int data;
        Node next;
        // Constructor
        public Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    // since in a LL there is one head and one tail
    public static Node head;
    public static Node tail;
    public static int size = 0;
    // this function appends a node
    public void addLast(int data)
    {
        // Step 1 = Create a new node
        Node newNode = new Node(data);
        size++;
        // if LL is empty
        if (head == null)
        {
            // then let head and tail point to newNode
            head = tail = newNode;
            return;
        }
        // otherwise let tail.next point to newNode
        tail.next = newNode;
        // after that update tail since now new node is the tail
        tail = newNode;
        // let newNode.next Point to null
        newNode.next = null;
    }
    // this function detects whether a LL has a cycle or not 
    public static boolean checkCycle()
    {
        // we are using slow and fast approach
        Node slow = head;  // +1
        Node fast = head;  // +2
        // traversing through LL until fast and fast next point to null
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            // if at any point slow == fast then a cycle is there in LL
            if (slow == fast)
            {
                return true;
            }
        }
        return false;
    }

    // this function traverses through LL and prints data at the node
    public void printLL()
    {
        // this is a case when our LL is empty
        if (head == null)
        {
            System.out.println("LL is empty");
            return;
        }
        // if it is not empty we are storing head in temp
        // now both are pointing to same node
        Node temp = head;
        // traversing through LL
        while (temp != null)
        {
            // printing data
            System.out.print(temp.data + " ");
            // updating temp
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.println(checkCycle());
        head.next.next.next = head;
        System.out.println(checkCycle());
    }
}
