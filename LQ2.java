/* 2) Print numbers from 1 to n */
import java.util.*;
public class LQ2
{
    public static void print(int n)
    {//base case
        if (n == 0)
        {
            return;
        }
        // function call inner
        print(n - 1);
        // kaam
        System.out.print(n + " ");

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        // inputing n
        int n = sc.nextInt();
        // printing n
        print(n);
    }
}
