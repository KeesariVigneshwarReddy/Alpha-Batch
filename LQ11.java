/* 11) Print all the numbers from 1 to 10 except 3 */
import java.util.*;
public class LQ11
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // a simple for loop to print number
        for (int i = 1; i <= 10; i++)
        {
            if (i == 3)
            {
                // if this gets true this iteration will be skipped
                continue;
            }
            System.out.println(i);
        }
    }
}
