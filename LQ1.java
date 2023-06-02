/* 1) Activity selection code
      You are given n activities with their start and end times. Select the max number of activities
      that can be performed by a single person, assuming that a person can work on a single activity at a time.
      Activities are sorted according to end time.  */
import java.util.*;
public class LQ1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // inputing no. of activities
        int n = sc.nextInt();
        // declaring start time and end time array
        int start[] = new int[n];
        int end[] = new int[n];
        // inputing in arrays
        for (int i = 0; i < start.length; i++)
        {
            start[i] = sc.nextInt();
        }
        for (int i = 0; i < end.length; i++)
        {
            end[i] = sc.nextInt();
        }
        // this is like count of max activities
        int maxAct = 0;
        // we made a array list in order store indexes of activities selected
        ArrayList<Integer> ans = new ArrayList<>();
        // since first activity ends first, therefore we should select that
        maxAct = 1;
        // add 0 in list
        ans.add(0);
        // this is a variable to store last activity end
        int lastActEnd = end[0];
        for (int i = 1; i < end.length; i++)
        {
            if (start[i] >= lastActEnd)
            {
                // increasing count
                maxAct++;
                // adding index to list
                ans.add(i);
                // updating last activity end
                lastActEnd = end[i];
            }
        }
        System.out.println(maxAct);
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}
