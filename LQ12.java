/* 12) Remove all duplicates in a string    */
import java.util.*;
public class LQ12
{
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[])
    {
        if (idx == str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true)
        {
            removeDuplicates(str, idx + 1, newStr, map);
        }
        else
        {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
