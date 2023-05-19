/* 2) Quick Sort */
import  java.util.*;
public class LQ2
{
    public static int partition(int a[], int si, int ei)
    {
        int pivot = a[ei];
        // this makes place for elements smaller than pivots
        int i = si - 1;
        for (int j = si; j < ei; j++)
        {
            // sorting on one side
            if (a[j] <= pivot)
            {
                i++;
                // swap
                int temp = a[j];
                a[j] =a[i];
                a[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        a[ei] = a[i];
        a[i] = temp;
        return i;
    }
    // recursive function which performs quick sort operation
    public static void quickSort(int a[], int si, int ei)
    {
        // if finally only one element is left then return
        if (si >= ei)
        {
            return;
        }
        // calculate pivot index
        int pIdx = partition(a, si, ei);
        // recursive call for left part
        quickSort(a, si, pIdx - 1);
        // recursive call for right part
        quickSort(a, pIdx + 1, ei);
    }
    public static void main(String[] args)
    {
        // inputing no. of elements and array
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        // calling this recursive function which performs quick sort operation
        quickSort(a, 0, a.length - 1);
        // printing the array
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
