/* 1) Print numbers from n to 1 */
import java.util.*;
public class LQ1
{
    public static void print(int n)
    {// base case
        if (n == 0)
        {
            return;
        }
        // kaam
        System.out.print(n + " ");
        // inner call
        print(n - 1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        // inputing n
        int n = sc.nextInt();
        // calling function
        print(n);
    }
}
