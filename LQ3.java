/* 3) Print number from 1 to n using while loop */
import java.util.*;
public class LQ3
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n)
        {
            System.out.println(i);
            i++;
        }
    }
}
