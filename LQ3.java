// 3) Pattern 1
//            1 2
//            1 2 3
//            1 2 3 4
import java.util.*;
public class LQ3
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt(); 
        // outer loop counts rows(i) and inner loop print number wrt columns(j) and condition
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {  
                // when we observe the pattern when (j <= i) then only number is printed
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}
