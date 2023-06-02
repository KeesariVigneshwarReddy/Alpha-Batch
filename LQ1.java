/* 1) Implement a queue using Array*/
import java.util.*;
public class LQ1
{
    // we created a class Queue
    static class Queue
    {
        // properties
        static int arr[];
        // size of arr
        static int size;
        // we know that front is at index 0
        // rear is changing
        static int rear;
        // constructor
        Queue (int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty()
        {
            return rear == -1;
        }
        // add function
        public static void add(int data)
        {
            // last index
            if (rear == size - 1)
            {
                System.out.println("Queue is FULL");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        // remove function
        public static int remove()
        {
            if (isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++)
            {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }
        // peek function
        public static int peek()
        {
            if (isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args)
    {
        // creating queue of 5 elements
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty())
        {
            System.out.print(q.peek() + " ");
            // updating queue
            q.remove();
        }
    }
}
