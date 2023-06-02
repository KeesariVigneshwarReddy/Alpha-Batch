/* 10) Reverse a queue  */
import java.util.*;
public class LQ10
{
    public static void reverseQueue(Queue <Integer> q)
    {
        // this is an auxillary stack
        Stack <Integer> s = new Stack<>();
        // till queue gets empty push in stack
        while (!q.isEmpty())
        {
            s.push(q.remove());
        }
        // till stack gets empty add in queue
        while (!s.isEmpty())
        {
            q.add(s.pop());
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
        // this function performs reverse operation
        reverseQueue(q);
        // printing the final queue
        while (!q.isEmpty())
        {
            System.out.print(q.remove() + " ");
        }
    }
}
