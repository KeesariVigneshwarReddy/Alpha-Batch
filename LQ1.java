/* 1) Input a binary number and print whether it is odd or even */
import java.util.*;
public class LQ1
{
    public static void main(String[] args)
    {
        // inputing the binary number
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        // all even number have LSB = 0
        if ((n & 1) == 0)
        {
            System.out.println("Even");
        }
        // all odd numbers have LSB = 1
        else
        {
            System.out.println("Odd");
        }
    }
}
