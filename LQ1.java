/* 1) Check whether a person is adult or not by inputing his age */
import java.util.*;
public class LQ1
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // input age
        int age = sc.nextInt();
        // if this gets true then print adult
        if (age >= 18)
        {
            System.out.print("Adult");
        }
        // or else print not adult
        else
        {
            System.out.print("Not Adult");
        }
    }
}
