/* 2) Write a program that reads a set of integers, and then prints the sum of the even and odd integers. */
import java.util.*;
public class PQ2
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        // since we have calculate even sum and odd sum differently we have initialized them with 0
        int n, ES = 0, OS = 0;
        // input no. of elements in set
        n = sc.nextInt();
        // a loop which reads n numbers and check even or odd and add respectively
        for(int i = 1; i <= n; i++)
        {
            int j = sc.nextInt();
            if (j % 2 == 0)
            {
                // if condition gets true then that j will be added to ES
                ES += j;
            }
            else
            {
                // if condition gets false then that j will be added to OS
                OS += j;
            }
        }
        System.out.println("Even sum = " + ES);
        System.out.println("Odd sum = " + OS);
    }
}
