/* 1) Priority Queues basic implementation 
      Minimum element priority   */
import java.util.*;
public class LQ1
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        PQ.add(3);
        PQ.add(4);
        PQ.add(1);
        PQ.add(7);
        while (!PQ.isEmpty())
        {
            System.out.println(PQ.remove());
        }
    }
}
