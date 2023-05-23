/* 4) Binary Search
      Input 10 elements in an array. Check whether 11 is there or not */  
import java.util.*;
public class LQ4
{
    public static boolean checkKey(int a[], int key)
    {
        int start = 0, end = a.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (mid == key)
            {
                return true;
            }
            else if (mid > key)
            {
                end = mid - 1;
            }
            else if (mid < key)
            {
                start = mid + 1;
            }
        }
        return false;
    }
    public static boolean checkSorted(int a[])
    {
        for (int i = 0; i < 10; i++)
        {
            if (a[i] > a[i + 1])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10], key;
        key = sc.nextInt();
        for (int i = 0; i < 10; i++)
        {
            a[i] = sc.nextInt();
        }
        if (checkSorted(a))
        {
            if (checkKey(a, 0))
            {
                System.out.println("Found");
            }
        }
    }
}
