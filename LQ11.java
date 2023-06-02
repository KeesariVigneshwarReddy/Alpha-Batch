/* 11) Implement a deque using JCF  */
import java.util.*;
public class LQ11
{
    public static void main(String[] args)
    {
        Deque <Integer> dq = new LinkedList<>();
        dq.addFirst(10);
        dq.addFirst(20);
        System.out.println(dq);
        dq.addLast(30);
        dq.addLast(40);
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
