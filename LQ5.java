/* 5) Reverse a string using stack
      (JCF) */
import java.util.*;
public class LQ5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        // creating stack
        Stack<Character> s = new Stack();
        String str = sc.next();
        // pushing elements of string to stack
        for (int i = 0; i < str.length(); i++)
        {
            s.push(str.charAt(i));
        }
        // printing string initially
        System.out.println(str);
        // we use string builder for space efficiency
        StringBuilder sb = new StringBuilder("");
        // this loop runs till stack becomes empty
        while (!s.isEmpty())
        {
            // we pop from stack
            // and append in stringBuilder
            sb.append(s.pop());
        }
        // converting stringBuilder to string
        str = sb.toString();
        // printing string reversed
        System.out.println(str);
    }
}
