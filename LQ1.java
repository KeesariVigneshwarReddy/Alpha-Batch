/* 1) Merge sort*/
import  java.util.*;
public class LQ1
{
    public static void merge(int a[], int si, int mid, int ei)
    {
        // a temporay array which stores the merged part
        int temp[] = new int [ei - si + 1];
        // this is pointer for left part
        int i = si;
        // this is pointer for right part
        int j = mid + 1;
        // this is pointer for temp array
        int k = 0;
        // merging
        while (i <= mid && j <= ei)
        {
            if (a[i] < a[j])
            {
                temp[k++] = a[i++];
            }
            else
            {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid)
        {
            temp[k++] = a[i++];
        }
        while (j <= ei)
        {
            temp[k++] = a[j++];
        }
        for (k = 0, i = si; k < temp.length; k++, i++)
        {
            a[i] = temp[k];
        }
    }
    // recursive function which performs merge sort operation
    public static void mergeSort(int a[], int si, int ei)
    {
        // dividing array with help of mid
        // if finally only one element is left then return
        if (si >= ei)
        {
            return;
        }
        // calculate mid
        int mid = si + (ei - si) / 2;
        // recursive call for left part
        mergeSort(a, si, mid);
        // recursive call for right part
        mergeSort(a, mid + 1, ei);
        // this totally merges the array after sorting
        merge(a, si, mid, ei);
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
        // calling this recursive function which performs merge sort operation
        mergeSort(a, 0, a.length - 1);
        // printing the merged array
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
