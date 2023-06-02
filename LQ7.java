/* 7) Implement a stack using 2 using 2 queues */
import java.util.*;
public class LQ7
{
    // creating a stack with help of 2 queues
    static class Stack
    {
        // creating 2 JCF Queues
        static Queue <Integer> q1 = new LinkedList<>();
        static Queue <Integer> q2 = new LinkedList<>();
        public static boolean isEmpty()
        {
            // we do not know when are the elements
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data)
        {
            // we add data to the queue that is not empty
            if (!q1.isEmpty())
            {
                q1.add(data);
            }
            else
            {
                q2.add(data);
            }
        }
        public static int pop()
        {
            // checking whether stack is empty or not
            if (isEmpty())
            {
                System.out.println("Stack Empty");
                return -1;
            }
            int top = -1;
            // case 1 - When q2 is empty and q1 is not empty
            if (!q1.isEmpty())
            {
                // add elements from q1 to q2
                while (!q1.isEmpty())
                {
                    top = q1.remove();
                    if (q1.isEmpty())
                    {
                        break;
                    }
                    q2.add(top);
                }
            }
            // case 2 - when q1 is empty and q2 is not empty
            else
            {
                // add elements from q2 to q1
                while (!q2.isEmpty())
                {
                    top = q2.remove();
                    if (q2.isEmpty())
                    {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        public static int peek()
        {
            // checking whether queue is empty or not
            if (isEmpty())
            {
                System.out.println("Stack Empty");
                return -1;
            }
            int top = -1;
            // case 1 - When q2 is empty and q1 is not empty
            if (!q1.isEmpty())
            {
                while (!q1.isEmpty())
                {
                    top = q1.remove();
                    q2.add(top);
                }
            }
            // case 2 - when q1 is empty and q2 is not empty
            else
            {
                while (!q2.isEmpty())
                {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }
    public static void main(String[] args)
    {
        // creating a stack
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
