/* 1) Write a Java method to compute average of 3 numbers */
import java.util.*;
public class PQ1
{
    public static float average(int a, int b, int c)
    {
        return (a + b + c) / 3;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average = " +  average(a, b, c));
    }
}
