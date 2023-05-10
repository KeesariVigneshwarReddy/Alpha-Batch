/* 9) Print all numbers from 1 to 10. Do not print number after 3 */
import java.util.*;
public class LQ9
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++)
        {
            // if the condition gets true then we comeout of entire for loop
            if (i > 3)
            {
                break;
            }
            System.out.println(i + "\n");
        }
    }
}
