/* 5) Implement a queue using JCF
      using ArrayDeque class        */
import java.util.*;
public class LQ5
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new ArrayDeque<>();
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
