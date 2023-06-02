/* 6) Implement a queue using 2 Stacks  */
import java.util.*;
public class LQ6
{
    // creating a queue with help of 2 stacks
    static class Queue
    {
        // creating 2 JCF Staks
        static Stack <Integer> s1 = new Stack<>();
        static Stack <Integer> s2 = new Stack<>();
        public static boolean isEmpty()
        {
            return s1.isEmpty();
        }
        public static void add(int data)
        {
            // step 1 = pushing all elements from s1 to s2
            while (!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            // s1 is empty now
            // step 2 = pushing the data (that we want to add in queue) in s1
            s1.push(data);
            // step 3 = pushing all elements from s2 to s1
            while (!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
            // s2 is empty now
        }
        public static int remove()
        {
            // checking whether queue is empty or not
            if (isEmpty())
            {
                System.out.println("Queue Empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek()
        {
            // checking whether queue is empty or not
            if (isEmpty())
            {
                System.out.println("Queue Empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args)
    {
        // creating a queue
        Queue q = new Queue();
        // adding values in queue
        q.add(10);
        q.add(20);
        q.add(30);
        // printing elements in queue till it gets empty
        while (!q.isEmpty())
        {
            // printing peek value
            System.out.print(q.peek() + " ");
            // removing
            q.remove();
        }
    }
}
