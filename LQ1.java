/* 1) Back Tracking on arrays
      Input elements in an array and decrease 2 from each element using recursion   */
import java.util.Scanner;
public class LQ1
{
    public static void inputAndDecrease2(int a[], int t, int n)
    {
        if (t == n)
        {
            return;
        }
        Scanner sc = new Scanner(System.in);
        a[t] = sc.nextInt();
        inputAndDecrease2(a, t + 1, n);
        a[t] -= 2;//backtracking
        // while returning we are performing some operations
    }
    public static void print(int a[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        inputAndDecrease2(a, 0, n);
        print(a, n);
    }
}
