// 1) Pattern *
//            * *
//            * * *
//            * * * *
import java.util.*;
public class LQ1
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt(); 
        // outer loop counts rows(i) and inner loop print * wrt columns(j) and condition
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {  
                // when we observe the pattern when (j <= i) then only * is printed
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
