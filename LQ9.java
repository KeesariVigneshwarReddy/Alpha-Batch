/* 9) Type Conversion */
import java.util.*;
public class LQ9
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // int to float is possible
        // but in case of vice versa it leads to lossy conversion
        int a = 25;
        float b = a;
        System.out.println(b);;
    }
}
