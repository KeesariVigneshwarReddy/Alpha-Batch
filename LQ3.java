/* 3) Calculate Product of 2 variables using function */
import java.util.*;
public class LQ3
{
    public static int product(int a, int b)
    {
        return a * b;
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Product = " + product(a, b));
    }
}
