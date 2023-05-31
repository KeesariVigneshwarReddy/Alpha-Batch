/* 3) Print reverse of an array list           */
import java.util.ArrayList;
import java.util.*;
public class LQ3
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
        // printing reversed AL
        System.out.println("Reversed ArrayList ");
        for (int i = list.size() - 1; i >= 0; i--)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
