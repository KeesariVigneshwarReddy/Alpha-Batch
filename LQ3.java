/* 3) Input a binary number and set i th bit */
import java.util.*;
public class LQ3
{
    public static void main(String args[])
    {
        // inputing the binary number
        Scanner sc = new Scanner (System.in);
        // the index which should be set
        int n = sc.nextInt();
        int i = sc.nextInt();
        // we right shift 1 by the index then do or with n
        System.out.print(n | (1 << i));
    }
}
