// 4) Pattern A
//            B c
//            D E F
//            G H I J
import java.util.*;
public class LQ4
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = sc.nextInt(); 
        // lets declare and define a character 'A'
        char ch = 'A';
        // outer loop counts rows(i) and inner loop print number wrt columns(j) and condition
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {  
                // when we observe the pattern when (j <= i) then only number is printed
                System.out.print(ch + " ");
                // in the next row since we are not printing 'A' we are printing 'B'.
                // So we are incresing ch value by one everytime
                ch++;
            }
            System.out.print("\n");
        }
    }
}
