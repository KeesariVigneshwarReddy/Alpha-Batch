/* 5) Income tax calculator */
import java.util.*;
public class LQ5
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        if (income < 500000)
        {
            System.out.println("IT = " + income);
        }
        else if (income >= 500000 && income <= 1000000)
        {
            System.out.println("IT = " + (income * 0.2f));
        }
        else if (income > 1000000)
        {
            System.out.println("IT = " + (income * 0.3f));
        }
    }
}
