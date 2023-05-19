/* 7) First occurence of a element in a array
    print the index */
import java.util.*;
public class LQ7
{
    public static int firstOccurence(int a[], int key, int i)
    {
        if (i == a.length)
        {
            return -1;
        }
        if(a[i] == key)
        {
            return i;
        }
        return firstOccurence(a, key, i + 1);
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
        System.out.println(firstOccurence(a, key, 0));
    }
}
