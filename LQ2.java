/* 2) Given a route containing 4 directions (E W N S) find shortest path
   "WNEENESENNN"
   shortest route is 5*/
import java.util.*;
public class LQ2
{
    public static void main(String[] args)
    {
        // inputing string
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = 0, y = 0;
        for (int i = 0; i < str.length() - 1; i++)
        {
            switch (str.charAt(i))
            {
                case 'W' :    x--;
                    break;
                case 'N' :    y++;
                    break;
                case 'E' :    x++;
                    break;
                case 'S' :    y--;
                    break;
            }
        }
        System.out.print("Shortest Distance = " + (float)Math.sqrt(x * x + y * y));
     }
}
