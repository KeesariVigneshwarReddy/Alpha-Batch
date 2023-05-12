/* 3) Write a Java program to check a number is palindrome or not */
import java.util.*;
public class PQ3
{
    // a function that check whether number is palindrome or not.
    public static boolean checkPalindrome(int n)
    {
        // since number become 0 at end, so we store value of n in a temporary variable
        int t = n;
        // initialize pal with 0
        int pal = 0;
        while (n > 0)
        {
            pal = pal * 10 + (n % 10);
            n /= 10;
        }
        // if pal is not equal to temp then false will be returned
        if (pal != t)
        {
            return false;
        }
        // we have returned true if above condition is false
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // input number
        int n = sc.nextInt();
        // if checkPalindrome() function return true then palindrome will be printed
        if (checkPalindrome(n))
        {
            System.out.println("Palindrome");
        }
        // if checkPalindrome() function return false then not palindrome will be printed
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
