/* 3) Back Tracking on strings
      Permutations of a string   */
import java.util.Scanner;
public class LQ3
{
    public static void permutations(String str, String ans)
    {
        // base case
        if (str.length() == 0)
        {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++)
        {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutations(newStr, ans + currChar);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permutations(str, "");
    }
}
