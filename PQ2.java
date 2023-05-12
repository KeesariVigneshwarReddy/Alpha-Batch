/* 2) Write a Java method to check whether a number is even or odd */
import java.util.*;
public class PQ2
{
    public static boolean checkEven(int n)
    {
        if (n % 2 != 0)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (checkEven(n))
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
