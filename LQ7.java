/* 7) Heap sort
      (Descending) */
import java.util.*;
public class LQ7
{
    // heapify with min heap logic
    public static void heapify(int arr[], int i, int size) // O(log(n))
    {
        // left and right indices for a node
        int L = 2 * i + 1;
        int R = 2 * i + 2;
        // finding minIdx
        int minIdx = i;
        // condition reversed
        if (L < size && arr[L] < arr[minIdx])
        {
            minIdx = L;
        }
        // condition reversed
        if (R < size && arr[R] < arr[minIdx])
        {
            minIdx = R;
        }
        if (minIdx != i)
        {
            // Swap
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            // if any other node gets disturbed then we make recursive call for minIdx
            heapify(arr ,minIdx, size);
        }
    }
    // heapsort function
    public static void heapSort(int arr[])
    {
        // Step 1 -> Build min heap
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--)
        {
            // this contains min heap logic
            heapify(arr, i, n);
        }
        // Step 2 -> Push Largest at end and heapify
        for (int i = n - 1; i > 0; i--)
        {
            // swap first idx with last idx
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // heaapify
            heapify(arr ,0, i);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 4, 5, 3};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
