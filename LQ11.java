/* 11) Max area in histogram
       Given an array of integers heights representing the histogram's bar height where the
       width of each bar is 1, return the area of largest rectangle in the histogram. 
       example
       [2, 1, 5, 6, 2, 3]    = 10                                  */
import java.util.*;
public class LQ11
{
    // this function returns max area of histogram
    public static int maxArea(int a[])
    {
        // Step 1 = Next Smaller right (refer to Q8) simple changes
        int NSR[] = new int[a.length];
        // declaring a stack
        Stack s = new Stack<>();
        // back ward traverse
        for (int i = a.length - 1; i >= 0; i--)
        {
            // we pop the peek if a[(int)s.peek()] <= a[i]
            while (!s.isEmpty() && a[(int)s.peek()] >= a[i])
            {
                s.pop();
            }
            // if the stack is empty then no greater element exist
            if (s.isEmpty())
            {
                NSR[i] = a.length;
            }
            else
            {
                NSR[i] = (int)s.peek();
            }
            // we always push the index
            s.push(i);
        }
        // Step 2 = Next Smaller left (refer to Q8) simple changes
        int NSL[] = new int[a.length];
        // emptying the stack
        s = new Stack<>();
        // forward traverse
        for (int i = 0; i < a.length; i++)
        {
            // we pop the peek if a[(int)s.peek()] <= a[i]
            while (!s.isEmpty() && a[(int)s.peek()] >= a[i])
            {
                s.pop();
            }
            // if the stack is empty then no greater element exist
            if (s.isEmpty())
            {
                NSL[i] = -1;
            }
            else
            {
                NSL[i] = (int)s.peek();
            }
            // we always push the index
            s.push(i);
        }
        // curr area and max area
        // let max area be -infinity
        int max = Integer.MIN_VALUE;
        // traversing through array
        for (int i = 0; i < a.length; i++)
        {
            int height = a[i];
            int width = NSR[i] - NSL[i] - 1;
            int currArea = height * width;
            if (currArea > max)
            {
                max = currArea;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        // inputing number elements in array
        int n = sc.nextInt();
        // inputing elements in array
        int a[] = new int [n];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        // this function returns max area of histogram
        System.out.println(maxArea(a));
    }
}
