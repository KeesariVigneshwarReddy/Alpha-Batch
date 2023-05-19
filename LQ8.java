/* 8) Last occurence of a element in a array
     print the index */
import java.util.*;
public class LQ8
{
    public static int lastOccurence(int a[], int key, int i)
    {
        if (i == 0)
        {
            return -1;
        }
        if(a[i] == key)
        {
            return i;
        }
        return lastOccurence(a, key, i - 1);
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
        int key = sc.nextInt();
        System.out.println(lastOccurence(a, key, a.length - 1));
    }
}
