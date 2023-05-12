/* 9) Decimal to binary number */
import java.util.*;
public class LQ9
{
    // a function which converts decimal number to binary
    public static int decToBin(int n) 
    {
        // whenever we are converting a dec to bin then weight is 10
        int bin = 0, weight = 1;
        while (n > 0)
        {
            bin += (n % 2) * weight;
            // always multiply weight with 10
            weight *= 10;
            n /= 2;
        }
        // process continues until n becomes 0
        return bin;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        // input the decimal number 
        int n = sc.nextInt();
        // call the function which convert dec to bin
        System.out.println("Binary Equivalent = " + decToBin(n));
    }
}
