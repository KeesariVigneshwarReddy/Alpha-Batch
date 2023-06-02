/* 4) Implement a queue using JCF
      using LinkedList class        */
import java.util.*;
public class LQ4
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        // adding elements
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty())
        {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
