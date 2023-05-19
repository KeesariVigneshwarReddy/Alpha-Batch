/* 10) Print x to power n
   optimized */
import java.util.*;
public class LQ10
{
    public static int XToPowerN(int x, int n)
    {
        if (n == 0)
        {
            return 1;
        }
        int halfPower = XToPowerN(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        if (n % 2 != 0)
        {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(XToPowerN(x, n));
    }
}
