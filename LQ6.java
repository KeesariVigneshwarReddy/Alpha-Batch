/* 6) Reverse an array without using another array */  
import java.util.*;
public class LQ6
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
        // printing array before
        System.out.println("Array before");
        for (int j = 0; j < a.length; j++)
        {
            System.out.print(a[j] + " ");
        }
        System.out.println();
        // we take take first and last index of array
        int i, j = a.length - 1;
        for (i = 0; i < j; i++, j--)// we increase value of i and decrease value of j
        {
            // using a temporary variable we swap values at two indexes
            int t;
            t = a [i];
            a[i] = a[j];
            a[j] = t;
        }
        // this process continues till i < j
        // a loop which prints array after
        for (int k = 0; k < a.length; k++)
        {
            System.out.print(a[k] + " ");
        }
    }
}
