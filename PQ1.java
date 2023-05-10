/* 1) In a program, input 3 numbers : A, B and C.
You have to output the average of these 3 numbers*/
import java.util.*;
public class PQ1
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // input a
        int a = sc.nextInt();
        // input b
        int b = sc.nextInt();
        //input c
        int c = sc.nextInt();
        //print average
        System.out.println((float)(a + b + c) / 3);
    }
}
