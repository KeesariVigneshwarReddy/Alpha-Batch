/* 11) Print maximum sum of subarrays
   Method 3 */  
import java.util.*;
public class LQ11
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
        // the simple goal in our program is to ignore negative values of sum
        // if negative update the sum value to 0
        // lets initialize sum with 0 and let max be minimum possible integer
        int sum = 0, max = Integer.MIN_VALUE;
        // this loop traverses through all elements in array
        for (int i = 0; i < a.length; i++)
        {
            // we always update sum by adding the element
            sum += a[i];
            // if at any point of time sum is negative then update it to 0
            if (sum < 0)
            {
                sum = 0;
            }
            // this condition updates max
            if (sum > max)
            {
                max = sum;
            }
        }
        // finally printing max
        System.out.println("Max SubArray Sum = " + max);
    }
}
