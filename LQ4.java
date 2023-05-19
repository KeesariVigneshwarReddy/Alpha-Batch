/* 4) Print sum of first n natural numbers */
import java.util.*;
public class LQ4
{
    public static int sum(int n)
    {// base case
        if (n == 1)
        {
            return 1;
        }
        return n + sum(n - 1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        // inputing n
        int n = sc.nextInt();
        // calling function
        System.out.println(sum(n));
    }
}
