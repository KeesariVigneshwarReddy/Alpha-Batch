/* 5) Input a binary number and update i th bit */
import java.util.*;
public class LQ5
{
    public static int set(int n, int i)
    {
        return n | (1 << i);
    }
    public static int clear(int n, int i)
    {
        return n & ~(1 << i);
    }
    public static void main(String args[])
    {
        // inputing the binary number
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        // the index which should be updated
        int i = sc.nextInt();
        // if update is 1 then set
        // if update is 0 then clear
        int update = sc.nextInt();
        if (update == 1)
        {
            System.out.print(set(n, i));
        }
        else if (update == 0)
        {
            System.out.print(clear(n, i));
        }
    }
}
