// 2) Pattern * * * *
//            * * *
//            * * 
//            * 
import java.util.*;
public class LQ2
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt(); 
        // outer loop counts rows(i) and inner loop print * wrt columns(j) and condition
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i + 1; j++)
            {  
                // when we observe the pattern when (j <= n - i + 1) then only * is printed
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
