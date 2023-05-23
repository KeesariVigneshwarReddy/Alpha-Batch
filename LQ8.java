/* 8) Print all subarrays of an array */  
import java.util.*;
public class LQ8
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
        // outer loop fix a index
        for (int i = 0; i < a.length; i++)
        {
            // inner loop fix a index that starts from i and goes till length of loop
            for (int j = i; j < a.length;j++)
            {
                // this loop prints all elements between elements i and j
                for (int k = i; k <= j; k++)
                {
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
