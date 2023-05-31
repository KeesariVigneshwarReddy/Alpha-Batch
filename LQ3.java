/* 3) Recursive search
      Search for a key in a LL. Return thr position where it is found.
      If not found, return -1     */
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
    // this function traverses through LL and searches for key
    public static int searchKey(Node temp, int key, int i)
    {
        // this is a case when our LL is empty
        if (temp == null)
        {
            return -1;
        }
        if (temp.data == key)
        {
            return i;
        }
        return searchKey(temp.next, key, i + 1);
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
        // inputing key
        int key = sc.nextInt();
        System.out.println(searchKey(head, key, 0));
    }
}
