/* 5) Swap two numbers in an array List with indexes (given)        */
import java.util.ArrayList;
import java.util.*;
public class LQ5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        // creating a array list
        ArrayList<Integer> list = new ArrayList<>();
        // inputing array list elements
        while (true)
        {
            System.out.print("Do you want to add an element = ");
            char c = sc.next().charAt(0);
            if (c == 'y')
            {
                System.out.print("Enter the Element = ");
                int temp = sc.nextInt();
                list.add(temp);
            }
            else if(c == 'n')
            {
                break;
            }
        }
        // printing original AL
        System.out.println("Original ArrayList ");
        System.out.println(list);
        int idx1 = sc.nextInt();
        int idx2 = sc.nextInt();
        int temp1 = list.get(idx1);
        int temp2 = list.get(idx2);
        list.set(idx1, temp2);
        list.set(idx2, temp1);
        // printing swapped AL
        System.out.println("Swapped ArrayList ");
        System.out.println(list);
    }
}
