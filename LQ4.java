/* 4) Merge sort on LL */
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
    // this is a function which uses a temporary LL and merges the sorted LL 

    public Node merge(Node head1, Node head2)
    {
        // this is a temporary LL
        Node mergedLL = new Node (-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null)
        {
            if (head1.data <=head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null)
        {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        // we have returned mergedLL.next because we do not want the node with data -1
        return mergedLL.next;
    }
    // this function calculate mid for a LL 
    // respective left half and right half
    public Node getMid(Node head)
    {
        // we are using slow and fast approach
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        // finally we are returning slow which point to mid
        return slow;
    }
    // recursive function which performs merge sort operation
    public Node mergeSort(Node head)
    {
        // case of empty LL and single LL 
        if (head == null || head.next == null)
        {
            return head;
        }
        // find mid 
        Node mid = getMid(head);
        // left head and right head
        Node rightHead = mid.next;
        mid.next = null;
        // recursive call of merge sort for left part
        Node newLeft = mergeSort(head);
        // recursive call of merge sort for right part
        Node newRight = mergeSort(rightHead);
        // we tottaly merge the LL with help of this function
        return merge(newLeft, newRight);
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
        // we sort the LL with help of his function and update the head
        ll.head = ll.mergeSort(ll.head);
        // printing LL after sorting
        ll.printLL();
    }
}
