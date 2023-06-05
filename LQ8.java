/* 8) Nearest points
      We are given N points in a 2D plane. If we are at the origin, print the K nearest points
      example P(0) = (3, 3)
              P(1) = (5, -1)
              P(2) = (-2, 4)
              K = 2
              Answer = P(0), P(2)
*/
import java.util.*;
public class LQ8
{
    // Point class
    static class Point implements Comparable<Point>
    {
        // properties of a point
        int x;
        int y;
        int distance;
        int idx;
        // Constructor
        public Point(int x, int y, int idx)
        {
            this.x = x;
            this.y = y;
            this.distance = x * x + y * y;
            this.idx = idx;
        }
        @Override
        public int compareTo(Point p2)
        {
            return this.distance - p2.distance;
        }
    }
    public static void main(String[] args)
    {
        // points given 
        int points[][] = {{3, 3},
                          {5, -1},
                          {-2, 4}};
        int k = 2;
        // using priority queue 
        // priority is based on minimum distance from origin
        PriorityQueue<Point> PQ = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++)
        {
            // x coordinate
            int x = points[i][0];
            // y coordinate
            int y = points[i][1];
            // adding the point in priority queue
            PQ.add(new Point(x, y, i));
        }
        // loop runs from 0 -> k - 1
        for (int i = 0; i < k; i++)
        {
            System.out.println("P" + PQ.remove().idx);
        }
    }
}
