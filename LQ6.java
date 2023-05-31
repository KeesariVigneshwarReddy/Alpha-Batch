/* 6) Check if a LL is palindrome or not */
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
    // this function converts a LL into string its return type is string
    public String LLtoString(StringBuilder sb)
    {
        // traversing through the LL
        Node temp = head;
        while (temp != null)
        {
            // we append data of temporary node to sb
            sb.append(temp.data);
            temp = temp.next;
        }
        // finally converting StringBuilder to string and returning
        return sb.toString();
    }
    // this function checks whether a string is palindrome or not
    public static void checkPalindrome(String str)
    {
        // we would have to cases when string length is odd or even
        int evenCount = 0, oddCount = 0;
        if (str.length() % 2 == 0)
        {
            // we traverse from beginning of string and end of string to exactly mid of sting
            for (int i = 0, j = str.length() - 1; (i < str.length() / 2) && (j >= (str.length() / 2)); i++, j--)
            {
                // if characters at indexes i and j are same then we increase the even count
                if (str.charAt(i) == str.charAt(j))
                {
                    evenCount++;
                }
            }
            // if count is equal to half of length of string then it is a palindrome
            if (evenCount == str.length() / 2)
            {
                System.out.print("Palindrome");
            }
            else
            {
                System.out.print("Not Palindrome");
            }
        }
        else
        {
            // we traverse from beginning of string and end of string to exactly mid of sting
            for (int i = 0, j = str.length() - 1; (i < str.length() / 2) && (j > str.length() / 2); i++, j--)
            {
                // if characters at indexes i and j are same then we increase the even count
                if (str.charAt(i) == str.charAt(j))
                {
                    oddCount++;
                }
            }
            // if count is equal to half of length of string then it is a palindrome
            if (oddCount == str.length() / 2)
            {
                System.out.print("Palindrome");
            }
            else
            {
                System.out.print("Not Palindrome");
            }
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
        StringBuilder sb = new StringBuilder("");
        String str = ll.LLtoString(sb);
        checkPalindrome(str);
    }
}
