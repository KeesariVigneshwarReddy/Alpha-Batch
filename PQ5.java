/* 5) Print sum of digits of an integer */
import java.util.*;
public class PQ5
{
    // a function which calculate sum of digits
    public static int sumOfDigits(int n)
    {
        // initialize sum with 0
        int sum = 0;
        while (n > 0)
        {
            // add last digit to sum 
            sum += n % 10;
            // remove last digit at end of loop 
            n /= 10;
        }
        // this process continue until number become 0
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // input number
        int n = sc.nextInt();
        // calling the function which calculate sum of digits
        System.out.println("Sum of Digits = " + sumOfDigits(n));
    }
}
