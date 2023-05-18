/* 1) Check if a string is palindrome or not */
import java.util.*;
public class LQ1
{
    public static void main(String[] args)
    {
        // inputing string
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // we would have to cases when string length is odd or even
        int evenCount = 0, oddCount = 0;
        if (str.length() % 2 == 0)
        {
            // we traverse from beginning of string and end of string to exactly mid of sting
            for (int i = 0, j = str.length() - 1; (i < str.length() / 2) && (j >= (str.length() / 2)); i++, j--)
            {
                // if characters at indexes i and j are same then we increase the even count
                if (str.charAt(i) == str.charAt(j))
                {
                    evenCount++;
                }
            }
            // if count is equal to half of length of string then it is a palindrome
            if (evenCount == str.length() / 2)
            {
                System.out.print("Palindrome");
            }
            else
            {
                System.out.print("Not Palindrome");
            }
        }
        else
        {
            // we traverse from beginning of string and end of string to exactly mid of sting
            for (int i = 0, j = str.length() - 1; (i < str.length() / 2) && (j > str.length() / 2); i++, j--)
            {
                // if characters at indexes i and j are same then we increase the even count
                if (str.charAt(i) == str.charAt(j))
                {
                    oddCount++;
                }
            }
            // if count is equal to half of length of string then it is a palindrome
            if (oddCount == str.length() / 2)
            {
                System.out.print("Palindrome");
            }
            else
            {
                System.out.print("Not Palindrome");
            }
        }
     }
}
