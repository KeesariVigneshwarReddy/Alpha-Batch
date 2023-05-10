/* 13) Check if a number is prime or not */
import java.util.*;
public class LQ13
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // input number and initialize j with 0 
        int n = sc.nextInt(), j = 0;
        // create a loop which goes from 2 to n
        for (int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                // if we get some number which divides n and gives remainder o
                // then number will definately not be prime 
                // so we increased value of j
                j++;
            }
        }
        if (j > 0)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }
}
