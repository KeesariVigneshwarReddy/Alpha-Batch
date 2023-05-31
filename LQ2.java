/* 2) Back Tracking on strings
      Sub sets of a string   */
import java.util.Scanner;
public class LQ2
{
    public static void subsets(String str, String ans, int i)
    {
        if (i == str.length())
        {
            if (ans.length() == 0)
            {
                System.out.println("NULL");
            }
            else
            {
                System.out.println(ans);
            }
            return;
        }
        // Yes case
        subsets(str, ans + str.charAt(i), i + 1);
        // No case (Back Tracking)
        subsets(str, ans, i+ 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        subsets(str, "", 0);
    }
}
