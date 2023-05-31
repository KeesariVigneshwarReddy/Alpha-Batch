/* 4) Iterative approach
       Reverse a LL                    */
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
    public void reverseLL()
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = prev;
        }
        head = prev;
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
        Scanner sc = new Scanner(System.in);
        // the class name is LinkedList
        LinkedList ll = new LinkedList();
        // this temp variable is to take input in LL
        int temp = 0;
        // inputing no. of nodes
        int n = sc.nextInt();
        // with help of this for loop we are inputing data in node and
        // simultaneously appending it to LL
        for (int i = 0; i < n; i++)
        {
            temp = sc.nextInt();
            ll.addLast(temp);
        }
        ll.printLL();
        ll.reverseLL();
        ll.printLL();
    }
}
