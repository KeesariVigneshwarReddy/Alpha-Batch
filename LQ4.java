/* 4) Push at the bottom of the stack
      (JCF) */
import java.util.*;
public class LQ4
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
        // inputing the element which you want to push at bottom
        int bottom = sc.nextInt();
        // recursive function call
        pushAtBottom(s , bottom);
        // printing and popping
        while (!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
