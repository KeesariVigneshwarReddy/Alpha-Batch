/* 5) Print largest number and smallest number in an array and index */  
import java.util.*;
public class LQ5
{
    // a function which calculate max element and index
    public static void max(int a[]) 
    {
        // lets assume max index is 0 and max element is a[0]
        int max_i = 0, max = a[0];
        // a loop which compares all elements and max
        for (int i = 0; i < a.length; i++)
        {
            // if any element is greater than max. keep that element in max
            // also store the index value
            if (a[i] > max)
            {
                max = a[i];
                max_i = i;
            }
        }
        // finally print
        System.out.println("Max = " + max);
        System.out.println("Max index = " + max_i);
    }
    // a function which calculate min element and index
    public static void min(int a[]) 
    {
        // lets assume min index is 0 and min element is a[0]
        int min_j = 0, min = a[0];
        // a loop which compares all elements and min
        for (int j = 0; j < a.length; j++)
        {
            // if any element is lesser than max. keep that element in min
            // also store the index value
            if (a[j] < min)
            {
                min = a[j];
                min_j = j;
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Min index = " + min_j);
    }
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
        // calling min() function to print min element and index
        min(a);
        // calling max() function to print max element and index
        max(a);
    }
}
