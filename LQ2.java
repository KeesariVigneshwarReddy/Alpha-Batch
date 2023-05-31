/* 2) Remove a loop or cycle in LL */
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
    // this function remove the cycle in the LL
    public static void removeCycle()
    {
        // step 1 = detect cycle usinf slow fast approach
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null)
        {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast)
            {
                cycle = true;
                break;
            }
        }
        // when there is no cycle we return
        if (cycle == false)
        {
            return;
        }
        // finding meeting point
        slow = head;
        Node prev = null; // this would be the last node after removal of cycle
        while (slow != fast)
        {
            prev = fast;
            slow = slow.next; // +1
            fast = fast.next; // +1
        }
        // let the last node's next point to null
        // hence cycle is removed
        prev.next = null;
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
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1 -> 2 -> 3 -> 2
        System.out.println(checkCycle());
        removeCycle();
        System.out.println(checkCycle());
    }
}
