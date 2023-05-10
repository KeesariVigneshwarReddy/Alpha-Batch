/* 3) Print max of 2 numbers */
import java.util.*;
public class LQ3
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b)
        {
            System.out.println("A is max of two");
        }
        else if (a < b)
        {
            System.out.println("B is max of two");
        }
        else 
        {
            System.out.println("Both are equal");
        }
    }
}
