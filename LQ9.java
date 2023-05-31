/* 9) Container with most water (2 pointer approach) (Optimized)
      For given n lines on x-axis. Use 2 lines to form a container such
      that it holds maximum water
      Example :
      [1, 8, 6, 2, 5, 4, 8, 3, 7]
      output = 49                                                            */
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
public class LQ9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // creating array list
        ArrayList<Integer> list = new ArrayList<>();
        // inputing number of elements
        int n = sc.nextInt();
        // inputing elements in AL
        for (int i = 0 ; i < n; i++)
        {
            int temp = sc.nextInt();
            list.add(i, temp);
        }
        // let max be -infinity
        int max = Integer.MIN_VALUE;
        // let water stored be equal to 0 initially
        int WS = 0;
        // initializing 2 pointers LP and RP
        int LP = 0;
        int RP = n - 1;
        // this process gets continued until LP >= RP
        while (LP < RP)
        {
            // we have 2 pointers pointing to a part
            WS = Math.min(list.get(LP), list.get(RP)) * (RP - LP);
            if (WS > max)
            {
                max = WS;
            }
            if (list.get(LP) < list.get(RP))
            {
                LP++;
            }
            else
            {
                RP--;
            }
        }
        // finally printing max
        System.out.println(max);
    }
}
