/* 1) Create a LL
      a) addFirst function
      b) addLast function
      c) add function
      d) removeFirst function
      e) removeLast function
      f) printLL function*/
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
    // this function adds data to a node
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
        // otherwise let newNode.next point to head
        newNode.next = head;
        // after that let head point to newNode
        head = newNode;
    }
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
    // this function adds a node at a particular index
    public void add(int idx, int data)
    {
        // when we have to add at beginning of LL
        if (idx == 0)
        {
            addFirst(data);
            return;
        }
        // first step is to create a node
        Node newNode = new Node(data);
        size++;
        // let temp point to head
        Node temp = head;
        // since we are using 0 based indexing
        int i = 0;
        // we require is
        // temp should point to node at idx inputed
        while (i < idx - 1)
        {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // this function removes the first node in LL
    public void removeFirst()
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
        // simply update head other exceptional cases
        head = head.next;
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
        // let prev.next point to null
        prev.next = null;
        // tail of new LL is prev
        tail = prev;
        // since we have removed one node
        size--;
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
        // the class name is LinkedList
        LinkedList ll = new LinkedList();
    }
}
