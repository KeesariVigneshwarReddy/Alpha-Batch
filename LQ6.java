/* 6) Input a binary number and clear last i bits */
import java.util.*;
public class LQ6
{
    public static void main(String args[])
    {
        // inputing the binary number
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        // the index after which bits should be cleared
        int i = sc.nextInt();
        // till Q4 we were having a 1 and all 0's
        // now we need all ones for this question
        System.out.println(n & ((~0) << i));
    }
}
