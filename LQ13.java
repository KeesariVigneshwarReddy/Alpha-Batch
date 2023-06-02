/* 13) Implement a queue using deque  */
import java.util.*;
public class LQ13
{
    static class Queue
    {
        Deque<Integer> dq = new LinkedList<>();
        public void add(int data)
        {
            dq.addLast(data);
        }
        public int remove()
        {
            return dq.removeFirst();
        }
        public int peek()
        {
            return dq.getFirst();
        }
    }
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
