/* 3) Print all substrings of a string */
import java.util.*;
public class LQ3
{
    public static void main(String[] args)
    {
        // inputing string
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // outer loop fixes a index
        for (int i = 0; i < str.length(); i++)
        {
            // inner loop fix a index that starts from i and goes till length of loop
            for (int j = i; j < str.length(); j++)
            {
                // this loop prints all elements between elements i and j
                for (int k = i; k <= j; k++)
                {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
     }
}
