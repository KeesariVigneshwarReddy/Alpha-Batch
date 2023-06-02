/* 8) First non repeating letter in a stream of characters  */
import java.util.*;
public class LQ8
{
    public static void printNonRepeating(String str)
    {
        // this array keeps frequency records of alphabets
        int freq[] = new int[26];
        // creating a queue
        Queue<Character> q = new LinkedList<>();
        // traversing through string
        for (int i = 0; i < str.length(); i++)
        {
            // storing character at index
            char ch = str.charAt(i);
            // add character in queue
            q.add(ch);
            // increase its frequency
            freq[ch - 'a']++;
            // frequency of front of queue is greater than 1 then remove it
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1)
            {
                q.remove();
            }
            // after the previous loop there exists two cases
            // queue may be empty
            if (q.isEmpty())
            {
                System.out.print(-1 + " ");
            }
            // or else peek() is first non empty character
            else
            {
                System.out.print(q.peek() + " ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printNonRepeating(str);
    }
}
