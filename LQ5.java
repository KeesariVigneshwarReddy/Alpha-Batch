/* 5) Convert a LL into zig zag LL */
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
    public void zigZag()
    {
        // step 1 = find mid
        // we are using slow and fast approach
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        // step 2 = reversing 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // step 3 = traversing through left and right half and checking the data
        // alternate merge step
        Node leftHead = head;
        Node rightHead = prev;
        // we require extra two pointers
        Node nextLeft = null;
        Node nextRight = null;
        while (leftHead != null && rightHead != null)
        {
            // nextLeft points to leftHead.next in every iteration
            // we are simply storing the node in every iteration
            nextLeft = leftHead.next;
            // let leftHead.next point to rightHead
            leftHead.next = rightHead;
            // nextRight points to rightHead.next in every iteration
            // we are simply storing the node in every iteration
            nextRight = rightHead.next;
            // let rightHead.next point to nextLeft
            rightHead.next = nextLeft;
            // updating leftHead and rightHead so that we could traverse
            leftHead = nextLeft;
            rightHead = nextRight;
        }
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
        // printing LL initially
        ll.printLL();
        ll.zigZag();
        ll.printLL();
    }
}
