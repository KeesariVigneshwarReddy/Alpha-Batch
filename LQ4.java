/* 4) Implementing min heap with Array List
      this acts same priority queue */
import java.util.*;
public class LQ4
{
    static class Heap
    {
        ArrayList<Integer> AL = new ArrayList<>();
        public void add (int data) // O(log(n))
        {
            AL.add(data);
            // child idx
            int x = AL.size() - 1;
            //parent idx
            int par = (x - 1) / 2;
            // when value of child < value of parent
            // swap
            // while loop runs O(log n) in time
            while (AL.get(x) < AL.get(par))
            {
                // swap
                int temp = AL.get(x);
                AL.set(x, AL.get(par));
                AL.set(par, temp);
                // updating child and parents
                x = par;
                par = (x - 1) / 2;
            }
        }
        public int peek() // O(1)
        {
            return AL.get(0);
        }
        private void heapify(int i) // O(log(n))
        {
            // left and right indices for a node
            int L = 2 * i + 1;
            int R = 2 * i + 2;
            // finding minIdx
            int minIdx = i;
            if (L < AL.size() && AL.get(L) < AL.get(minIdx))
            {
                minIdx = L;
            }
            if (R < AL.size() && AL.get(R) < AL.get(minIdx))
            {
                minIdx = R;
            }
            if (minIdx != i)
            {
                // Swap
                int temp = AL.get(i);
                AL.set(i, AL.get(minIdx));
                AL.set(minIdx, temp);
                // if any other node gets disturbed then we make recursive call for minIdx
                heapify(minIdx);
            }
        }
        public int remove() // O (log(n))
        {
            int data = AL.get(0);
            // step 1 -> Swap first and last
            int temp = AL.get(0);
            AL.set(0, AL.get(AL.size() - 1));
            AL.set(AL.size() - 1, temp);
            // step 2 -> delete last
            AL.remove(AL.size() - 1);
            // step 3 -> heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty()
        {
            return AL.size() == 0;
        }
    }
    public static void main(String[] args)
    {
        // same as priority queue in JCF
        Heap H = new Heap();
        H.add(3);
        H.add(4);
        H.add(1);
        H.add(5);
        while (!H.isEmpty())
        {
            System.out.println(H.peek());
            H.remove();
        }
    }
}
