/* 4) Print max and min of an array list           */
import java.util.ArrayList;
import java.util.*;
public class LQ4
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
        // simple technique to calculate max and min
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) > max)
            {
                max = list.get(i);
            }
            if (list.get(i) < min)
            {
                min = list.get(i);
            }
        }
        System.out.print(max + "\n" + min);
    }
}
