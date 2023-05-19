/* 7) Input a binary number and clear range of bits */
import java.util.*;
public class LQ7
{
    public static void main(String args[])
    {
        // inputing the binary number
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        // inputing range
        int i = sc.nextInt();
        int j = sc.nextInt();
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        System.out.print(n & (a | b));
    }
}
