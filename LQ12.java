/* 12) Implement a stack using deque  */
import java.util.*;
public class LQ12
{
    static class Stack
    {
        Deque<Integer> dq = new LinkedList<>();
        public void push(int data)
        {
            dq.addLast(data);
        }
        public int pop()
        {
            return dq.removeLast();
        }
        public int peek()
        {
            return dq.getLast();
        }
    }
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
