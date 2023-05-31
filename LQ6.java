/* 6) Reverse a stack
      (JCF) */
import java.util.*;
public class LQ6
{
    // this is a recursive function which stores value of top and pop the top
    // when the stack becomes empty and then which help of backtracking we can push the stored values
    public static void pushAtBottom(Stack<Integer> s,int bottom)
    {
        // base case
        if (s.isEmpty())
        {
            s.push(bottom);
            return;
        }
        // kaam
        int temp = s.pop();
        // recursive call
        pushAtBottom(s, bottom);
        // backtracking
        s.push(temp);
    }
    public static void reverseStack(Stack<Integer> s)
    {
        if (s.isEmpty())
        {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s)
    {
        while (!s.isEmpty())
        {
            System.out.println(s.pop());
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        // creating stack
        Stack<Integer> s = new Stack();
        // no. of stacks
        int n = sc.nextInt();
        int temp = 0;
        // pushing elements
        for (int i = 1; i <= n; i++)
        {
            temp = sc.nextInt();
            s.push(temp);
        }
        printStack(s);
        reverseStack(s);
        printStack(s);
    }
}
