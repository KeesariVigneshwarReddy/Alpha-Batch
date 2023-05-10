/* 9) Make a calculator using switch statement */
import java.util.*;
public class LQ9
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // input 2 numbers
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        // input character operator
        char c = sc.next().charAt(0);
        switch (c)
        {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
        } 
    }
}
