/* 2) Implement a circular queue using Array */
import java.util.*;
public class LQ2
{
    // we created a class Queue
    static class Queue
    {
        // properties
        static int arr[];
        // size of arr
        static int size;
        // since front is changing
        static int rear;
        static int front;
        // constructor
        Queue (int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }
        public static boolean isFull()
        {
            return (rear + 1) % size == front;
        }
        public static void add(int data)
        {
            if (isFull())
            {
                System.out.println("Queue is FULL");
                return;
            }
            // add 1st element
            if (front == -1)
            {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        public static int remove()
        {
            if (isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            // we are storing value at front in result
            int result = arr[front];
            // case when we are deleting last element
            if (rear == front)
            {
                rear = front = -1;
            }
            else
            {
                front = (front + 1) % size;
            }
            return result;
        }
        public static int peek()
        {
            if (isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args)
    {
        // a queue is made of size 3
        Queue q = new Queue(3);
        // adding elements
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while (!q.isEmpty())
        {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
