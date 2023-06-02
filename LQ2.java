/* 2) Activity selection code
      You are given n activities with their start and end times. Select the max number of activities
      that can be performed by a single person, assuming that a person can work on a single activity at a time.
      Activities are not sorted according to end time.  */
import java.util.*;
public class LQ2
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
        // sorting
        int activities[][] = new int [start.length][3];
        // 0th column stores indexes
        // 1st column stores start time wrt indexes
        // 2nd column stores end time wrt indexes
        for (int i = 0; i < start.length; i++)
        {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        // the second argument is called lambda function (short form)
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        // this is like count of max activities
        int maxAct = 0;
        // we made a array list in order store indexes of activities selected
        ArrayList<Integer> ans = new ArrayList<>();
        // since first activity ends first, therefore we should select that
        maxAct = 1;
        // add 0 in list
        ans.add(activities[0][0]);
        // this is a variable to store last activity end
        int lastActEnd = activities[0][2];
        for (int i = 1; i < end.length; i++)
        {
            if (activities[i][1] >= lastActEnd)
            {
                // increasing count
                maxAct++;
                // adding index to list
                ans.add(activities[i][0]);
                // updating last activity end
                lastActEnd = activities[i][2];
            }
        }
        System.out.println(maxAct);
        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print("A" + ans.get(i) + " ");
        }
    }
}
