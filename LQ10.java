/* 10) Duplicate Parantheses
       Given a balanced expression, find if it contains duplicate parentheses or not. A set of
       parentheses are duplicate if the same subexpression is surrounded by multiple parenthesis.
       Return true if it contains duplicate else return false.
       example:
       (((a+(b)))+(c+d))    true
       ((((a)+(b))+c+d))    true
       ((a+b)+(c+d))        false            */
import java.util.*;
public class LQ10
{
    // this function returns true if a string is duplicate
    public static boolean checkDuplicate(String str)
    {
        // creating a stack
        Stack<Character> s = new Stack<>();
        // traversing through string
        for (int i = 0; i < str.length(); i++)
        {
            // in case of closing bracket
            if (str.charAt(i) == ')')
            {
                // initializr count with 0
                int count = 0;
                char top = s.peek();
                s.pop();
                // comparing peek with '('
                while (s.peek() != '(')
                {
                    // when not equal we pop and increase the count
                    top = s.peek();
                    s.pop();
                    count++;
                }
                // whenever count is less than 1 then it is duplicate string
                if (count < 1)
                {
                    return true;
                }
            }
            // if we encounter operator, operand or opening bracket we simply push in stack
            else
            {
                s.push(str.charAt(i));
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        // inputing the string
        String str = sc.next();
        // this function returns true if a string is duplicate
        if (checkDuplicate(str))
        {
            System.out.println("Duplicate");
        }
        else
        {
            System.out.println("Not Duplicate");
        }
    }
}
