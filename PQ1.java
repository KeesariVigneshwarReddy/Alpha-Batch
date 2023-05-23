/*  1) Given an integer array nums, return true if any value 
    appears at least twice in the array, and return false if every element is distinct */
    import java.util.*;
    public class PQ1
    {
        // a function which checks whether an element repeats or not
        // it always return false
        public static boolean checkCondition(int a[])
        {
            // outer loop traverses through all elements of array
            for (int i = 0; i < a.length; i++)
            {
                // inner loop traverses through all elements next to index i
                for (int j = i + 1; j < a.length; j++)
                {
                    // if somewhere we get same number we return true and we c
                    // ome out of function
                    if (a[i] == a[j])
                    {
                        return true;
                    }
                }
            }
            return false;
        }
        public static void main(String[] args)
        {
            // declaring the array 
            Scanner sc = new Scanner(System.in);
            int a[]= new int[10];
            // inputing all elements in array
            for (int i = 0; i < a.length; i++)
            {
                a[i] = sc.nextInt();
            }
            // if condition is true then true will be printed
            if (checkCondition(a))
            {
                System.out.println("True");
            }
            // if condition is false then false will be printed
            else
            {
                System.out.println("False");
            }
        }
    }
