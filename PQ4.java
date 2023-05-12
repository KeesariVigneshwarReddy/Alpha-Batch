/* 4) Use the following methods of the Math class in Java:
Math.min()
Math.max()
Math.sqrt()
Math.pow()
Math.avg()
Math.abs()  */
import java.util.*;
public class PQ4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // max of 2 numbers
        System.out.println("Max = " + Math.max(1, 5));
        // min of 2 numbers
        System.out.println("Min = "+ Math.min(1, 5));
        // square root of a number
        System.out.println("Sq root = " + Math.sqrt(8));
        // find a to power b
        System.out.println("A power B = " + Math.pow(2, 3));
        // absolute value of a number
        System.out.println("Average = " + Math.abs(-9));
    }
}
