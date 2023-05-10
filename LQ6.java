/* 6) Print largest and second largest of 3 numbers */
import java.util.*;
public class LQ6
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c)
        {
            System.out.println("A is max of 3");
            if (b > c)
            {
                System.out.println("B is second max");
            }
            else 
            {
                System.out.println("C is second max");
            }
        }
        else if (b > a && b > c)
        {
            System.out.println("B is max of 3");
            if (a > c)
            {
                System.out.println("A is second max");
            }
            else 
            {
                System.out.println("C is second max");
            }
        }
        else if (c > a && c > b)
        {
            System.out.println("c is max of 3");
            if (b > a)
            {
                System.out.println("B is second max");
            }
            else 
            {
                System.out.println("A is second max");
            }
        }
        else 
        {
            System.out.println("All numbers are equal");
        }
    }
}
