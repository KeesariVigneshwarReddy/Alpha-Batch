/* 7) Make a Multi dimensional AL
      list 1 : 1 2 3 4  5
      list 2 : 2 4 6 8  10
      list 3 : 3 6 9 12 15           */
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
public class LQ7
{
    public static void main(String[] args)
    {
        // creating main array list 
        // each element stores another AL
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // creating list 1, adding elements to it, and adding complete list to main list
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);list1.add(2);list1.add(3);list1.add(4);list1.add(5);
        mainList.add(list1);
        // creating list 2, adding elements to it, and adding complete list to main list
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);list2.add(4);list2.add(6);list2.add(8);list2.add(10);
        mainList.add(list2);
        // creating list 3, adding elements to it, and adding complete list to main list
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);list3.add(6);list3.add(9);list3.add(12);list3.add(15);
        mainList.add(list3);
        // traversing through mainList
        for (int i = 0; i < mainList.size(); i++)
        {
            // this current list access each list of ML 
            ArrayList<Integer> currList = mainList.get(i);
            // traversing through the current list
            for (int j = 0; j < currList.size(); j++)
            {
                // printing all elements of currList
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        // directly printing main list
        System.out.println(mainList);
    }
}
