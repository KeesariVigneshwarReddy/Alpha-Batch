/* 10) Keep inputing numbers until user enters multiple of 10 */
import java.util.*;
public class LQ10
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // lets declare a variable n
        int n;
        // loop runs always
        while (true)
        {
            // input n everytime until loop runs
            n = sc.nextInt();
            if (n % 10 == 0)
            {
                // if condition gets true we go out of loop
                break;
            }
        }
    }
}
