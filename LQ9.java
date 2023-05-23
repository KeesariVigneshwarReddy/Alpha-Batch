/* 9) Print maximum sum of subarrays 
   Method 1 */  
import java.util.*;
public class LQ9
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
        // let max be possible mimimum value
        int max = Integer.MIN_VALUE;
        // outer loop fix a index
        for (int i = 0; i < a.length; i++)
        {
            // inner loop fix a index that starts from i and goes till length of loop
            for (int j = i; j < a.length;j++)
            {
                // a sum variable is initialized with 0 everytime the loop start
                int sum = 0;
                // this loop adds the elements of all the subarrays to sum variable.
                // So sum of sub array is found.
                for (int k = i; k <= j; k++)
                {
                    sum += a[k];
                }
                // now here were are comparing sum with max.
                // everytime it will get updted
                if (sum > max)
                {
                    max = sum;
                }
            }
        }
        System.out.println("Max Subarray Sum = " + max);
    }
}
