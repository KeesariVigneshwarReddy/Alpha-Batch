/* 3) Print factorial of a number n */
import java.util.*;
public class LQ3
{
    public static int fact(int n)
    {// base case
        if (n == 1)
        {
            return 1;
        }
        return n * fact(n - 1);        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        // inputing n
        int n = sc.nextInt();
        // calling function
        System.out.println(fact(n));
    }
}
