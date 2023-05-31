/* 11) Pair sum 1
       Find if any pair in a Sorted ArrayList has a target sum
       (Optimized) (Two pointer approach) */
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
public class LQ11
{
    // this function returns true if target sum is possible
    public static boolean findTargetSum(ArrayList<Integer> list, int target)
    {
        // Left pointer start from beginning
        int LP = 0;
        // right pointer start from end
        int RP = list.size() - 1;
        int sum = 0;
        // we initialized sum of LP and RP
        while (LP < RP)
        {
            sum = list.get(LP) + list.get(RP);
            if (sum == target)
            {
                return true;
            }
            else if (sum < target)
            {
                LP++;
            }
            else if (sum > target)
            {
                RP--;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // creating array list
        ArrayList<Integer> list = new ArrayList<>();
        // inputing number of elements
        int n = sc.nextInt();
        // inputing elements in AL
        for (int i = 0 ; i < n; i++)
        {
            int temp = sc.nextInt();
            list.add(i, temp);
        }
        // initializing the target sum
        int target = sc.nextInt();
        // this function returns true if target sum is possible
        if (findTargetSum(list, target))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
