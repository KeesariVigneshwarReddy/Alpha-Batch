/* 8) Check wheteher student is pass or fail with tenary operator */
import java.util.*;
public class LQ8
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        // if condition is true pass will be stored in status
        // if condition is false fail will be stored in status
        String status = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(status); 
    }
}
