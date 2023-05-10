/* 3) Write a program to find factorial of any number */
import java.util.*;
public class PQ3
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n, fact = 1;
        n = sc.nextInt();
        // loop which always multiply fact with 1 to n
        // that is factorial
        for(int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);
    }
}
