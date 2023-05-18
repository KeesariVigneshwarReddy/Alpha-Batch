/* 4) Print largest string in array of strings 
     lexicographically */
import java.util.*;
public class LQ4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // inputing no. of elements in array of string
        int n = sc.nextInt();
        // inputing elements in array of strings
        String str[] = new String [n];
        for (int i = 0; i < n; i++)
        {
            str[i] = sc.next();
        }
        // lets assume str[0] is largest string
        String Largest = str[0];
        // travesrsing in array of strings
        for (int i = 0; i < n; i++)
        {
            // if we get any string larger than the Largest 
            if (str[i].compareToIgnoreCase(Largest) > 0)
            {
                Largest = str[i];
            }
        }
        System.out.println("Largest String = " + Largest);
     }
}
