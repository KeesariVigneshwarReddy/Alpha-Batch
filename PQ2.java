/* 2) There is an integer array nums sorted in ascending order 
(with distinct values).Prior to being passed to your function,
nums is possibly rotated at an unknown pivot  index k (1 <= k < nums.length)  
such  that  the  resulting  array  is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). 
For   example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, 
returnthe index oftarget if it is in nums, or -1   if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.  */
import java.util.*;
public class PQ2
{
    public static void main(String[] args)
    {
        // inputing no. of elements and elements in array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n], b[] = new int[n];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        // we decide the unknown pivot index 
        int k = sc.nextInt();
        // with the help of this loops we get the required array
        for (int i = 0; i < a.length - k - 1; i++)
        {
            b[i] = a[k + i];
        }
        for (int i = a.length - k; i < b.length; i++)
        {
            b[i] = a[i - k - 1];
        }
        // we input target
        int target = sc.nextInt();
        // with help of this loop we find target in the required array
        for (int i = 0; i < b.length; i++)
        {
            // if we find the target, we will print it
            if (b[i] == target)
            {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
