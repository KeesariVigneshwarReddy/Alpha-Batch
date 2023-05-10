/* 7) Print reverse of a number*/
import java.util.*;
public class LQ7
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // initialize sum with 0
        int sum = 0;
        while(n > 0)
        {
            // n % 10 gives last digit of any number
            sum = sum * 10 + n % 10; 
            // n / 10 removes last digit of any number
            n /= 10;
            // loop runs until the number become 0
        }
        System.out.println(sum);
    }
}
