/* 9) Valid Parantheses  
      Given a string s containing just the characters '(', ')', '{', '}', '[', ']'
      determine if the input string is valid
      An input string is valid if:
      1) Open brackets must be closed by the same type of brackets
      2) Open brackets must be closed in correct order
      3) Every close brackets has a corresponding open bracket of same type   */
import java.util.*;
public class LQ9
{
    // this function returns true if a string is valid
    public static boolean validParentheses(String str)
    {
        // creating a stack
        Stack<Character> s = new Stack<>();
        // traversing through string
        for (int i = 0; i < str.length(); i++)
        {
            // in case of opening brackets we push the character to stack
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[')
            {
                s.push(str.charAt(i));
            }
            // if we encounter a closing bracket
            else
            {
                // since we have three type of brackets so we have 3 cases
                if (str.charAt(i) == ')')
                {
                    // if peek represents the same type of opening brackets then we pop
                    if (s.peek() == '(')
                    {
                        s.pop();
                    }
                    // else we return false since close brackets do not have
                    //  corresponding open bracket of same type
                    else
                    {
                        return false;
                    }
                }
                else if (str.charAt(i) == '}')
                {
                    // if peek represents the same type of opening brackets then we pop
                    if (s.peek() == '{')
                    {
                        s.pop();
                    }
                    // else we return false since close brackets do not have
                    //  corresponding open bracket of same type
                    else
                    {
                        return false;
                    }
                }
                else if (str.charAt(i) == ']')
                {
                    // if peek represents the same type of opening brackets then we pop
                    if (s.peek() == '[')
                    {
                        s.pop();
                    }
                    // else we return false since close brackets do not have
                    //  corresponding open bracket of same type
                    else
                    {
                        return false;
                    }
                }
            }
        }
        if (s.isEmpty())
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        // inputing the string
        String str = sc.next();
        // this function returns true if a string is valid
        if (validParentheses(str))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Not Valid");
        }
    }
}
