/* 9) Given are N ropes of different lengths, the task is to connect these ropes
      into one rope with minimum cost, such that the cost to connect two ropes is equal
      to the sum of their lengths.
      Ropes = {4, 3, 2, 6}
      Answer = 29
                           cost
      connect 2 and 3       5
      connect 5 and 4       9
      connect 9 and 6       15
*/
import java.util.*;
public class LQ9
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        int a[] = {2, 3, 3, 4, 6};
        // storing lengths of ropes in PQ based on priority
        for (int i = 0; i < a.length; i++)
        {
            PQ.add(a[i]);
        }
        int cost = 0;
        while (PQ.size() > 1)
        {
            // remove first two elements from PQ
            int min1 = PQ.remove();
            int min2 = PQ.remove();
            // calculate cost
            cost += min1 + min2;
            // add the joined rope to priority queue
            PQ.add(min1 + min2);
        }
        System.out.println(cost);
    }
}
