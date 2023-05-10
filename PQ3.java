/* 3) Enter cost of 3 items from user. Add find total cost including GST */
import java.util.*;
public class PQ3
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // input a
        float a = sc.nextFloat();
        // input b
        float b = sc.nextFloat();
        // input c
        float c = sc.nextFloat();
        //print cost with GST
        System.out.println((float)(a + b + c) + ((a + b + c) * 0.18f));
    }
}
/*
    Here we have declared 0.18 are float since compiler may think it as double. There is a type conversion from int to float
*/
