/* 2) Check whether a person is adult or teenager or child by inputing his age */
import java.util.*;
public class LQ2
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // input age
        int age = sc.nextInt();
        // if this gets true adult will be prited
        if (age >= 18)
        {
            System.out.print("Adult");
        }
        // if "if" statement gets false then this will be executed
        else if (age >= 13 && age < 18)
        {
            System.out.print("Teenager");
        }
        // if above "else if" gets false then this gets executed
        else if (age < 13)
        {
            System.out.print("Child");
        }
    }
}
