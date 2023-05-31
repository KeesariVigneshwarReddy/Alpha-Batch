/* 6) Sort an array list in both ascending and descending order     */
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
public class LQ6
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
        // sorting AL in ascending order
        Collections.sort(list);
        // printing AL in ascending order
        System.out.println("Ascending order ArrayList ");
        System.out.println(list);
        // sorting AL in descending order
        Collections.sort(list, Collections.reverseOrder());
        // printing AL in descending order
        System.out.println("Descending order ArrayList ");
        System.out.println(list);
    }
}
