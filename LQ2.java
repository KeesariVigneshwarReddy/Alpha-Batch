/* 2) Priority Queues basic implementation
      Maximum element priority      */
import java.util.*;
public class LQ2
{
    public static void main(String[] args)
    {
        // we have used comparator
        PriorityQueue<Integer> PQ = new PriorityQueue<>(Comparator.reverseOrder());
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
