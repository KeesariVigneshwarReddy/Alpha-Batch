/* 1) input marks of 10 subjects in an array, print that array, calculate percentage */  
import java.util.*;
public class LQ1
{
    public static void main(String[] args)
    { 
        // declaring an array which stores marks of 10 subjects
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);
        // a loop which inputs all elements of an array
        for (int i = 0; i < 10; i++)
        {
            marks[i] = sc.nextInt();
        }
        // a loop which prints all elements of an array
        for (int j = 0; j < 10; j++)
        {
            System.out.println("Subject "+ j + " = " + marks[j]);
        }
        // we initialize sum with 0
        int sum = 0;
        // a loop which add alll elements
        for (int k = 0; k < 10; k++)
        {
            sum += marks[k];
        }
        // finally we print percentage
        System.out.println("Percentage = " + sum / 10);
    }
}
