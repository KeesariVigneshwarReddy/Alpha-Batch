/* 2) Check whether a person is having fever or not */
import java.util.*;
public class PQ2
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        float temperature = sc.nextFloat();
        if (temperature > 100)
        {
            System.out.println("You have fever");
        }
        else
        {
            System.out.println("You do not have fever");
        }
    }
}
