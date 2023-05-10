/* 12) Display all the numbers entered by user except multiples of 10 */
import java.util.*;
public class LQ12
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // Declaring a variable
        int n;
        // a while loop which runs everytime
        while (true)
        {
            // inputing n till loop runs
            n = sc.nextInt();
            if (n % 10 == 0)
            {
                // if this gets true then this iteration will be skipped
                continue;
            }
            // since we need to exit from loop we made a condition that will break at this condition
            if (n > 100)
            {
                break;
            }
            System.out.println(n);
        }
    }
}
