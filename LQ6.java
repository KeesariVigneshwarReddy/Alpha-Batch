/* 6) Check whether an array is sorted or not */
import java.util.*;
public class LQ6
{
    public static boolean checkSorted(int a[], int i)
    {
        if (i == a.length - 1)
        {
            return true;
        }
        if(a[i] > a[i + 1])
        {
            return false;
        }
        return checkSorted(a, i + 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        if (checkSorted(a, 0))
        {
            System.out.println("Sorted");
        }
        else
        {
            System.out.println("Not Sorted");
        }
    }
}
