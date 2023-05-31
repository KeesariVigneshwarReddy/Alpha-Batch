/* 7) Stock Span
      (JCF) */
import java.util.*;
public class LQ7
{
    // 
    public static void stockSpan(int stock[], int span[])
    {
        // we created a stack
        Stack<Integer> s = new Stack<>();
        // this is default 
        span[0] = 1;
        s.push(0);
        // we are starting from first index
        for (int i = 1; i < stock.length; i++)
        {
            // currPrice is price of stock for that index
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice > stock[s.peek()])
            {
                s.pop();
            }
            if (s.isEmpty())
            {
                span[i] = i + 1;
            }
            else
            {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        // no. of days of a stock 
        int n = sc.nextInt();
        // inputing stock prices
        int stock[] = new int [n];
        // this array is used to calculate span
        int span[] = new int[stock.length];
        for (int i = 0; i < stock.length; i++)
        {
            stock[i] = sc.nextInt();
        }
        // this function calculate stock span with respect to index
        stockSpan(stock, span);
        // printing span
        for (int i = 0; i < span.length; i++)
        {
            System.out.print(span[i] + " ");
        }
    }
}
