/* 8) Next greater Right
      (JCF)
      Other forms of the question a) Next greater element Left
                                  b) Next Smaller element Right
                                  c) Next Smaller element Left   */
import java.util.*;
public class LQ8
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        // no. of elements in array
        int n = sc.nextInt();
        // this is our main array
        int a[] = new int [n];
        // this array stores next greater element with respect to indices
        int nextGreater[] = new int [n];
        // inputing elements in array
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        // declaring a stack
        Stack s = new Stack<>();
        // back ward traverse
        for (int i = a.length - 1; i >= 0; i--)
        {
            // we pop the peek if a[(int)s.peek()] <= a[i]
            while (!s.isEmpty() && a[(int)s.peek()] <= a[i])
            {
                s.pop();
            }
            // if the stack is empty then no greater element exist
            if (s.isEmpty())
            {
                nextGreater[i] = -1;
            }
            else
            {
                nextGreater[i] = a[(int)s.peek()];
            }
            // we always push the index
            s.push(i);
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(nextGreater[i] + " ");
        }
    }
}
