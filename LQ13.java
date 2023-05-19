/* 13) Friends pairing problem
       Given n friends, each one can remain single or can be paired up with some other friend.
       Each friend can be paired only once. Find out the number of ways in which friends
       can remain single or paired up      */
import java.util.*;
public class LQ13
{
    public static int friendsPairing(int n)
    {
        if (n == 1 || n == 2)
        {
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(friendsPairing(n));
    }
}
