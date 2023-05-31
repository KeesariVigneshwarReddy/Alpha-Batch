/* 6) Create a Doubly LL
      a) addFirst function
      b) addLast function
      c) removeFirst function
      d) removeLast function  */
import java.util.*;
class DoublyLinkedList
{
    // A node in a DLL
    public class Node
    {
        // all properties
        int data;
        Node next;
        Node prev;
        // Constructor
        public Node (int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    // since we have only one head and one tail
    public static Node head;
    public static Node tail;
    public static int size = 0;
    // this adds data to a node
    public void addFirst(int data)
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
        // other wise let newNode.next point to head
        newNode.next = head;
        // let head.prev point to newNode
        head.prev = newNode;
        // after that let head point to newNode
        head = newNode;
    }
    // this appends a node
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
        // let newNode.prev point to tail
        newNode.prev = tail;
        // after that update tail since now new node is the tail
        tail = newNode;
        // let newNode.next Point to null
        newNode.next = null;
    }
    // this function removes the first node in DLL
    public void removeFirst()
    {
        // exception handling
        if (head == null)
        {
            System.out.println("DLL is Empty");
            return;
        }
        else if (size == 1)
        {
            head = tail = null;
            // since we are removing a node
            size = 0;
            return;
        }
        // simply update head other exceptional cases
        head = head.next;
        head.prev = null;
        // since we are removing a node
        size--;
    }
    public void removeLast()
    {
        // exception handling
        if (size == 0)
        {
            System.out.println("LL is Empty");
        }
        else if (size == 1)
        {
            head = tail = null;
            // since we are removing a node
            size = 0;
            return;
        }
        // we push prev to last second node
        Node prev = head;
        for (int i = 0; i < size - 2; i++)
        {
            prev = prev.next;
        }
        prev.next.prev = null;
        // let prev.next point to null
        prev.next = null;
        // tail of new LL is prev
        tail = prev;
        // since we have removed one node
        size--;
    }
    // this function traverses through DLL and prints data at the node
    public void printDLL()
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
        // since the class name is DoublyLinkedList
        DoublyLinkedList dll = new DoublyLinkedList();
    }
}
