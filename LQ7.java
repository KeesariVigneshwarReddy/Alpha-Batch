/* 7) Check wheteher a number is even or odd with tenary operator */
import java.util.*;
public class LQ7
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // if condition is true even will be stored in result
        // if condition is false odd will be stored in result
        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result); 
    }
}
