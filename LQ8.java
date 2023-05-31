/* 8) Container with most water
      For given n lines on x axis. Use 2 lines to form a container such
      that it holds maximum water
      Example :
      [1, 8, 6, 2, 5, 4, 8, 3, 7]
      output = 49                                                            */
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
public class LQ8
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
        // the simple goal take all possible pairs
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                // then calculate water stored for a particular pair
                WS = Math.min(list.get(i), list.get(j)) * (j - i);
                // always update the max with respect to water stored
                if (WS > max)
                {
                    max = WS;
                }
            }
        }
        // finally printing max
        System.out.println(max);
    }
}
