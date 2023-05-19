/* 11) Tiling Problem
   Given a "2 x n" floor and tiles of size "2 x 1", count the number of
    ways to tile the given board using the 2 x 1 tiles.
    A tile can either be placed horizontally or vertically */
import java.util.*;
public class LQ11
{
    public static int tilingProblem(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tilingProblem(n));
    }
}
