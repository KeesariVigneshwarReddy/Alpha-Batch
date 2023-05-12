/* 6) Check if a number is prime or not */
import java.util.*;
public class LQ6
{
    // a function return true if the number is prime, false if number is not prime
    public static boolean checkPrime(int n)
    {
        // a code to to check n is prime
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // input n
        int n;
        n = sc.nextInt();
        // if checkPrime() return true prime will be printed
        if(checkPrime(n))
        {
            System.out.println("Prime");
        }
        // if checkPrime() return false prime will not be printed
        else 
        {
            System.out.println("Not Prime");
        }
    }
}
