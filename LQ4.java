/* 4) Factorial of a number using function */
import java.util.*;
public class LQ4
{
    public static int factorial(int n)
    {
        // factorial code
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        // input n
        n = sc.nextInt();
        // call function for calculating factorial
        System.out.println("Factorial = " + factorial(n));
    }
}
