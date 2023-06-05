/* 10) We are given an m x n binary matrix of 1's (Soldiers) and 0's (Civilians).
       The soldiers are positioned in front of the civilians. That is, all the 1's will appear
       to the left of all the 0's in each row.
       A row is weaker than a row j if one of the following is true:
       1) The number of soldiers in row i is less than the number of soldiers in row j
       2) Both rows have the same number of soldiers and i < j
       Find K weakest rows
       m = 4, n = 4, k = 2       ans = Row 0 (and) Row 2
       1 0 0 0
       1 1 1 1
       1 0 0 0
       1 0 0 0                       */
import java.util.*;
public class LQ10
{
    // this class contains data of row
    static class Row implements Comparable<Row>
    {
        // count of soldiers
        int count;
        // index of row
        int idx;
        // constructor
        public Row(int count, int idx)
        {
            this.count = count;
            this.idx = idx;
        }
        // comparing function
        @Override
        public int compareTo(Row R2)
        {
            // on basis of index
            if (this.count == R2.count)
            {
                return this.idx - R2.idx;
            }
            // on basis of count
            else
            {
                return  this.count - R2.count;
            }
        }
    }
    public static void main(String[] args)
    {
        // the binary matrix
        int matrix[][] = {{1, 0, 0, 0},
                          {1, 1, 1, 1},
                          {1, 0, 0, 0},
                          {1, 0, 0, 0}};
        int k = 2;
        PriorityQueue<Row> PQ = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++)
        {
            int count = 0;
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (matrix[i][j] == 1)
                {
                    count++;
                }
            }
            PQ.add(new Row(count, i));
        }
        for (int i = 0; i < k; i++)
        {
            System.out.print(PQ.remove().idx + " ");
        }
    }
}
