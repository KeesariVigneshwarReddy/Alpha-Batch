/* (Optimized)
4) Determine if 2 Strings are anagrams of each other.
What are anagrams?
If two strings contain the same characters but in a different order, they can be said to be anagrams. Consider race and care.
In this case, race's characters can be formed into a study, or care's characters can be formed into race. */
import java.util.*;
import java.util.Arrays;
public class PQ4
{
    public static boolean compareArray(char freq1[], char freq2[])
    {
        for (int i = 0; i < freq1.length; i++)
        {
            if (freq1[i] != freq2[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length())
        {
            char str1array[] = str1.toCharArray();
            char str2array[] = str2.toCharArray();
            Arrays.sort(str1array);
            Arrays.sort(str2array);
            if (compareArray(str1array, str2array))
            {
                System.out.print("Anagram");
            }
            else
            {
                System.out.print("Not Anagram");
            }
        }
        else
        {
            System.out.print("Not Anagram");
        }
    }
}
