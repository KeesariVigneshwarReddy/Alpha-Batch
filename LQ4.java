/* 4) Input a binary number and clear i th bit */
import java.util.*;
public class LQ4
{
    public static void main(String args[])
    {
        // inputing the binary number
        Scanner sc = new Scanner (System.in);
        // the index which should be clear
        int n = sc.nextInt();
        int i = sc.nextInt();
        // we right shift 1 by the index then do its one's complement then do and with n
        System.out.print(n & ~(1 << i));
    }
}
