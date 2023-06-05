/* 11)  Maximum subarrays of k size

        array = 1 2 3 4 5 6 7 8 9 10
 result array = 3 4 5 6 7 8 9 10
 
        array = 1 3 -1 -3 5 3 6 7
 result array = 3 3 5 5 6 7              */
import java.util.*;
public class LQ11
{
    // this class contains data of pair
    static class Pair implements Comparable<Pair>
    {
        int value;
        int idx;
        // constructor
        public Pair(int value, int idx)
        {
            this.value = value;
            this.idx = idx;
        }
        // comparing function
        @Override
        public int compareTo(Pair P2)
        {
            // sorts in descending order
            return P2.value - this.value;
        }
    }
    // the code runs in O(n log(k))
    public static void main(String[] args)
    {
        // the given array
        int a[] = {1, 3, -1, -3, 5, 3, 6, 7};
        // window size
        int k = 3;
        // rusultant array
        int resultArray[] = new int[a.length - k + 1];
        // max heap logic
        PriorityQueue<Pair> PQ = new PriorityQueue<>();
        // our first window
        for (int i = 0; i < k; i++)
        {
            PQ.add(new Pair(a[i], i));
        }
        resultArray[0] = PQ.peek().value;
        for (int i = k; i < a.length; i++)
        {
            // when top of PQ consists of an index which is not part of a window
            while (PQ.size() > 0 && PQ.peek().idx <= i - k)
            {
                PQ.remove();
            }
            // add current pair to PQ
            PQ.add(new Pair(a[i], i));
            // updating resultArray
            resultArray[i - k + 1] = PQ.peek().value;
        }
        // print result array
        for (int i = 0; i < resultArray.length; i++)
        {
            System.out.print(resultArray[i] + " ");
        }
    }
}
