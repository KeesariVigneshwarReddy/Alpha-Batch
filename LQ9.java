/* 9) Print x to power n */
import java.util.*;
public class LQ9
{
    public static int XToPowerN(int x, int n)
    {
        if (n == 0)
        {
            return 1;
        }
        return x * XToPowerN(x, n - 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(XToPowerN(x, n));
    }
}
