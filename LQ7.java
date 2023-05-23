/* 7) Make total possible pairs in an array */  
import java.util.*;
public class LQ7
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
        // this is a nested loop which print all the pairs
        // outer loop fix a index
        for (int i = 0; i < a.length; i++)
        {
            // inner loop traverse through the elements after the a[i]
            for (int j = i + 1; j < a.length;j++)
            {
                // basic print statement 
                System.out.println("("+ a[i] + "," + a[j] +  ")");
            }
        }
    }
}
