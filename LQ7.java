/* 7) Reverse a DLL  */
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
    // this function reverses the DLL
    public void reverseDLL()
    {
        // 3 pointer 5 steps approach
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        // finally updating head
        head = prev;
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
        Scanner sc = new Scanner(System.in);
        // since the class name is DoublyLinkedList
        DoublyLinkedList dll = new DoublyLinkedList();
        // inputing number of nodes
        int n = sc.nextInt();
        // inputing data in nodes
        int temp;
        for (int i = 0; i < n; i++)
        {
            temp = sc.nextInt();
            dll.addLast(temp);
        }
        // printing DLL initially
        dll.printDLL();
        // reversing DLL
        dll.reverseDLL();
        // printing reversed DLL
        dll.printDLL();
    }
}
