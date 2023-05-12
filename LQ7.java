/* 7) Print all prime number in a range */
import java.util.*;
public class LQ7
{
    // a function that will check whether number which is traversed in
    // printPrime() is prime or not
    public static boolean checkPrime(int i)
    {
        // a code which check number is prime or not
        for (int j = 2; j <= Math.sqrt(i); j++)
        {
            if (i % j == 0)
            {
                return false;
            }
        }
        return true;
    }
    // a function that will print prime numbers in given range
    public static void printPrime(int LL, int UL) 
    {
        // a loop which traverse through all the numbers in the range
        for (int i = LL; i <= UL; i++)
        {
            if (checkPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) 
    {
        // inputing the upper and lower limit
        Scanner sc = new Scanner(System.in);
        int LL, UL;
        LL = sc.nextInt();
        UL = sc.nextInt();
        // call the function
        printPrime(LL, UL);
    }
}
