/* 3) Implement a stack using java collection framework */
import java.util.*;
public class LQ3
{
    public static void main(String[] args)
    {
        // creating stack
        Stack<Integer> s = new Stack();
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
