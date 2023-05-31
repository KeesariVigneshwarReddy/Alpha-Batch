/* 7) Check if a LL is palindrome or not
       (Method 2) Space optimized */
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
    // slow fast approach to find middle
    public Node findMid(Node head)
    {
        // initialize the two pointers with head
        Node slow = head;
        Node fast = head;
        // 1st condition is for even no. of nodes
        // 2nd condition is for odd no. of nodes
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        // after this while loop slow will point to mid node of LL
        return slow;
    }
    // this function checks whether a LL is palindrome or not
    public boolean checkPalindrome()
    {
        // base case
        if (head == null || head.next == null)
        {
            return true;
        }
        // step 1 = to find mid node of LL
        Node midNode = findMid(head);
        // step 2 = reversing 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // step 3 = traversing through left and right half and checking tne data
        Node leftHead = head;
        Node rightHead = prev;
        while (rightHead != null)
        {
            // if at any point data do not match we return false
            if (leftHead.data != rightHead.data)
            {
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }
        return true;
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
        if(ll.checkPalindrome())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
