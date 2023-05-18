/* 2) Input a binary number and get i th bit */
import java.util.*;
public class LQ2
{
    public static void main(String[] args)
    {
        // inputing the binary number
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        // inputing the index
        int i = sc.nextInt();
        // in Q1 we found the bit at 0th index 
        // here we generalizing the same thing 
        // we left shift one by i and do and with n
        if ((n & (1<<i)) == 0)
        {
            System.out.print("0");
        }
        else
        {
            System.out.print("1");
        }
    }
}
