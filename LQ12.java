/* 12) Pair Sum 2
       Find if any pair in a Sorted and rotated ArrayList has a target sum
       (Brute Force) */
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
public class LQ12
{
    // this function returns true if target sum is possible
    public static boolean findTargetSum(ArrayList<Integer> list, int target)
    {
        // making all possible pairs
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = 0; j < list.size(); j++)
            {
                // adding the elements of all possible pairs and comparing with target
                if (list.get(i) + list.get(j) == target)
                {
                    return true;
                }
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
