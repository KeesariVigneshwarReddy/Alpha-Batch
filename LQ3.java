/* 3) Use java collection framework and perform operations on LL */
import java.util.*;
public class LQ3
{
    public static void main(String[] args)
    {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
