/* 5) Calculate binomial coefficient */
import java.util.*;
public class LQ5
{
    // function which calculate n factorial
    public static int nFactorial(int n)
    {
        int fact1 = 1;
        for (int i = 1; i <= n; i++)
        {
            fact1 *= i;
        }
        return fact1;
    }
    // function which calculate r factorial
    public static int rFactorial(int r)
    {
        int fact2 = 1;
        for (int i = 1; i <= r; i++)
        {
            fact2 *= i;
        }
        return fact2;
    }
    // function which calculate (n - r) factorial
    public static int nmrFactorial(int k)
    {
        int fact3 = 1;
        for (int i = 1; i <= k; i++)
        {
            fact3 *= i;
        }
        return fact3;
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n, r;
        n = sc.nextInt();
        r = sc.nextInt();
        // final evaluation of formula
        System.out.println("Binomial coeffient = " + (nFactorial(n) /  (rFactorial(r) * nmrFactorial(n - r))));
    }
}
