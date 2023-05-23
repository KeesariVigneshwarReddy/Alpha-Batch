/* 10) Print maximum sum of subarrays 
   Method 2 */  
import java.util.*;
public class LQ10
{
    public static void main(String[] args)
    {
        // declaring an array
        int a[] = new int[10];
        // inputing elements in an array
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        // printing array 
        System.out.println("Array");
        for (int j = 0; j < a.length; j++)
        {
            System.out.print(a[j] + " ");
        }
        System.out.println();
        // making a prefix array in which sum of all the previous indexes are stored
        int prefix[] = new int[10];
        prefix[0] = a[0];
        for (int i = 1; i < prefix.length; i++)
        {
            prefix[i]= prefix[i - 1] + a[i];
        }
        // we are initializing max minimum posssible value 
        int max = Integer.MIN_VALUE;
        // outer loop traverse through all elements in array
        for (int i = 0; i < a.length; i++)
        {
            // we initialize start with i
            int start = i;
            // inner loop traverse through all elements from i to a.length
            for (int j = i; j < a.length; j++)
            {
                int sum = 0;
                int end = j;
                sum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1]; 
                // if the condition satisfies we assign the sum value to max
                if (sum > max)
                {
                    max = sum;
                }
            }
        }
        // finally printing the max subarray sum
        System.out.println("Max subarray sum = " + max);
    }
}
