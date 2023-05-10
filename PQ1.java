/* 1) Check whether a number is positive or negative */
import java.util.*;
public class PQ1
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is negative");
        }
    }
}
