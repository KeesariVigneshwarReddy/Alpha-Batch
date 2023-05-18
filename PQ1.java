/* 1) Count how many times lowercase vowels occured in string entered by user */
import java.util.*;
public class PQ1
{
    public static void main(String[] args)
    {
        // inputing string
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // initializing count with 0
        int count = 0;
        // traversing through string
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.print(count);
    }
}
