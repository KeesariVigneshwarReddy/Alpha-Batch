/* 1) Implement a stack using ArrayList */
import java.util.*;
public class LQ1
{
    // creating a stack using array list
    static class Stack
    {
        // declaring a arraylist
        static ArrayList<Integer> list = new ArrayList<>();
        // cheching whether stack is empty or not
        public static boolean isEmpty()
        {
            return list.size() == 0;
        }
        // push function
        public static void push(int data)
        {
            list.add(data);
        }
        // pop function
        public static int pop()
        {
            // exceptions
            if (isEmpty())
            {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        // peek function
        public static int peek()
        {
            // exceptions
            if (isEmpty())
            {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
    public static void main(String[] args)
    {
        // creating stack
        Stack s = new Stack();
        // pushing data
        s.push(1);
        s.push(2);
        s.push(3);
        // printing and popping
        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
