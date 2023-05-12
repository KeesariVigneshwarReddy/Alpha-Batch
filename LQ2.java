/* 2) Calculate sum of 2 variables using function */
import java.util.*;
public class LQ2
{ 
    // function is returning integer value so its return type is int. 
    // arguments are passed from main function as parameters in sum functions
    public static int sum(int a, int b)// a, b are parameters
    {
        // we are returning a + b
        return a + b;
    }
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        // here we have called the function 
        System.out.println("Sum = " + sum(a, b));//a, b are arguments
    }
}
