/* 3) Linear Search
      Input 10 elements in an array. Check whether 11 is there or not */  
import java.util.*;
public class LQ3
{
    // a function which check whether the key is present or not. This function always return false.
    public static boolean checkKey(int a[], int key) // a[] is passed by reference
    {
        // a loop compare each and every element with key
        for (int i = 0; i < a.length; i++)
        {
            // if the respective element is equal to key then we return true
            // since we have found that key
            if (a[i] == key)
            {
                return true;
            }
        }
        // if we did not find the key then we return false
        return false;
    }
    public static void main(String[] args)
    {
        // declaring an array
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        // inputing elements of an array
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        // declare and define the key
        int key = 11;
        // if checkKey return true then the key is present 
        if (checkKey(a, key))
        {
            System.out.println("Yes");
        }
        // if checkKey return false then the key is not present
        else 
        {
            System.out.println("No");
        }
    }
}
