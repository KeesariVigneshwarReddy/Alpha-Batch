/* 4) Print if a number is even or odd */
import java.util.*;
public class LQ4
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // input n
        int n = sc.nextInt();
        // if here division by 2 gives remainder 0. Even will be printed.
        if (n % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
