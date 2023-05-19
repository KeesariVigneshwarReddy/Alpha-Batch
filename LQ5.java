/* 5) Find n th fibonacci number */
import java.util.*;
public class LQ5
{
    public static int fibo(int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibo(n));
    }
}
