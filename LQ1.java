/* 1) Print HW 100 times using while loop */
import java.util.*;
public class LQ1
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // we started counter with 1 
        int i = 1;
        // while loop will be executed till the condition gets false
        while (i <= 100)
        {
            System.out.println("HW");
            // we are increasing the counter while traversing through loop
            i++;
        }
    }
}
