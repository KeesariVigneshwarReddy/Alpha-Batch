/* 8) Binary to decimal number */
import java.util.*;
public class LQ8
{
    // a function which converts binary number to decimal
    public static int binToDec(int n) 
    {
        // whenever we are converting a bin to dec then weight is 2
        int dec = 0, weight = 1;
        while (n > 0)
        {
            // take last digit and multiply it by weight and add to dec
            dec += (n % 10) * weight;
            // always multiply weight with 2
            weight *= 2;
            // remove last digit for next next loop
            n /= 10;
        }
        // process continues until n becomes 0
        return dec;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // input the binary number 
        int n = sc.nextInt();
        // call the function convert bin to dec
        System.out.println("Decimal Equivalent = " + binToDec(n));
    }
}
