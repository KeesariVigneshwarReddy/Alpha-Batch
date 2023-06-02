/* 9) Interleave 2 halves of a queue (even length)  */
import java.util.*;
public class LQ9
{
    public static void Interleave(Queue <Integer> q)
    {
        // we made another queue which stores elements in first half
        Queue <Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        // shifting first half of main queue to another queve
        for (int i = 0; i < size / 2; i++)
        {
            firstHalf.add(q.remove());
        }
        // loop runs till first half queue becomes empty
        while (!firstHalf.isEmpty())
        {
            // remove from first half and add to main queue
            q.add(firstHalf.remove());
            // remove from main queue and add to main queue
            q.add(q.remove());
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        // no. of elements in queue
        int n = sc.nextInt();
        // inputing elements in queue
        int temp = 0;
        for (int i = 0; i < n; i++)
        {
            temp = sc.nextInt();
            q.add(temp);
        }
        // this function performs interleave operation
        Interleave(q);
        // printing the final queue
        while (!q.isEmpty())
        {
            System.out.print(q.remove() + " ");
        }
    }
}
